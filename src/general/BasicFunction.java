/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package general;
import java.sql.*;
import java.io.*;
import javax.swing.*;
import database.DatabaseConnection;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class BasicFunction {

    private Frame frame;

    public BasicFunction(Frame frame) {
        this.frame = frame;
    }

    private final String loadQuery = " SELECT \n" +
            "    s.stud_ID,\n" +
            "    CONCAT(s.stud_firstName, ' ', s.stud_middleInitial, '. ', s.stud_lastName) AS full_name,\n" +
            "    s.stud_age,\n" +
            "    s.stud_course,\n" +
            "    s.stud_yearLevel,\n" +
            "    sp.sport_name\n" +
            "    FROM student s\n" +
            "    JOIN sport sp ON s.sport_id = sp.sport_id; ";

    private final String saveQuery = "INSERT INTO student (stud_ID,stud_firstName,stud_middleInitial," +
            "stud_lastName,stud_age,stud_sex,stud_course,stud_yearLevel,sport_id, stud_address) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?);";

    private final String removeQuery = "DELETE FROM student WHERE stud_ID = ?"
                        + "ALTER TABLE student AUTO_INCREMENT = 1;";

    private final String parseInfo = "SELECT stud_address, stud_sex FROM student WHERE stud_ID = ?";

    private final String updateQuery = "UPDATE student SET " +
            "stud_ID = ?, " +
            "stud_firstName = ?, " +
            "stud_middleInitial = ?, " +
            "stud_lastName = ?, " +
            "stud_age = ?, " +
            "stud_sex = ?, " +
            "stud_course = ?, " +
            "stud_yearLevel = ?, " +
            "sport_id = ?, " +
            "stud_address = ? " +
            "WHERE stud_ID = ?";
    public void saveData() {

        String selectedID = frame.getSelectID();
        // Access text fields
        String firstName = frame.getFNTextField().getText();
        String middleInitial = frame.getMITextField().getText();
        String lastName = frame.getLNTextField().getText();
        String address = frame.getAddTextField().getText();
        String studentId = frame.getStudIdTextField().getText();
        String ageText = frame.getAgeTextField().getText();
        String name = (middleInitial).concat(" ").concat(lastName);

        // Access combo boxes
        String sex = frame.getSexComboBox().getSelectedItem().toString();
        String yearLevel = frame.getYearLevelComboBox().getSelectedItem().toString();
        String course = frame.getCourseComboBox().getSelectedItem().toString();
        int sportId = frame.getSportCombobox().getSelectedIndex();
        int age = 0;

        if (firstName.isEmpty() || name.isEmpty() || address.isEmpty() || studentId.isEmpty() || ageText.isEmpty() ||
                sex.isEmpty() || yearLevel.isEmpty() || sportId < -1 || course.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields");
            return;
        }

        try {
            age = Integer.parseInt(ageText);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Input must be number");
            return;
        }
        //check if the user is trying to update or add
        String query;
        query = (selectedID == null || selectedID.isEmpty()) ? saveQuery : updateQuery;

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query);) {

            Object[] param = {
                    studentId,
                    firstName,
                    middleInitial,
                    lastName,
                    age,
                    sex,
                    course,
                    yearLevel,
                    sportId,
                    address
            };
            for (int i = 0; i < param.length; i++) stmt.setObject(i + 1, param[i]);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Saved Successfully");

            //reset the form
            frame.getCourseComboBox().setSelectedIndex(0);
            frame.getSportCombobox().setSelectedIndex(0);
            frame.getYearLevelComboBox().setSelectedIndex(0);
            frame.getSexComboBox().setSelectedIndex(0);
            frame.getAddTextField().setText("");
            frame.getStudIdTextField().setText("");
            frame.getAgeTextField().setText("");
            frame.getMITextField().setText("");
            frame.getLNTextField().setText("");
            frame.getFNTextField().setText("");

            loadTableData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database Error: " + ex.getMessage());
        }
    }

    public void loadTableData() {

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(loadQuery);) {

            JTable table = frame.getAthleteTable();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                        rs.getString("stud_ID"),
                        rs.getString("full_name"),
                        rs.getInt("stud_age"),
                        rs.getInt("stud_yearLevel"),
                        rs.getString("stud_course"),
                        rs.getString("sport_name"),

                };
                model.addRow(row);
            }
            con.close();
            stmt.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(frame, "Connection Failed" + e.getMessage());
        }
    }

    public void removeData() {
        int selectedRow = frame.getAthleteTable().getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "Please select a row");
            return;
        }
        String id;
        id = (String) frame.getAthleteTable().getValueAt(selectedRow, 0);

        int confirm = javax.swing.JOptionPane.showConfirmDialog(frame,
                "Are you sure you want to remove this athlete?"
        );

        if (confirm == JOptionPane.YES_OPTION) {

            try {
                Connection con = DatabaseConnection.getConnection();
                PreparedStatement pstm = con.prepareStatement(removeQuery);
                pstm.setString(1, id);

                int checkRow = pstm.executeUpdate();

                if (checkRow > 0) {
                    JOptionPane.showMessageDialog(frame, "Successfully removed athlete");
                    loadTableData();
                } else {
                    JOptionPane.showMessageDialog(frame, "Cannot remove athlete");
                }
                con.close();
                pstm.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(frame, "Cannot remove athlete" + e.getMessage());
            }
        }
    }

    // export function
    public void exportData() {
        // chooser object allows user
        // to choose file location
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save CSV File");

        // setting automatic filename format when exporting
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new java.util.Date());
        chooser.setSelectedFile(new java.io.File("export_" + timestamp + ".csv"));
        int userSelection = chooser.showSaveDialog(frame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // selecting location to save
            File fileToSave = chooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // querying
            String query = "SELECT * FROM tbl_students";

            try (
                    // database connection
                    Connection con = DatabaseConnection.getConnection();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    PrintWriter pw = new PrintWriter(new FileWriter(filePath))
            ) {

                // data for getting column count
                ResultSetMetaData meta = rs.getMetaData();
                int columnCount = meta.getColumnCount();

                // Write header
                for (int i = 1; i <= columnCount; i++) {
                    pw.print(meta.getColumnName(i));
                    if (i < columnCount) pw.print(",");
                }
                pw.println();

                // Write data rows
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        pw.print(rs.getString(i));
                        if (i < columnCount) pw.print(",");
                    }
                    pw.println();
                }

                JOptionPane.showMessageDialog(frame, "Data exported successfully to:\n" + filePath);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        }
    }
        public void parseInfo(){
            String studID=frame.getSelectedID();
            if(studID.isEmpty()){
                return;
            }

            try (Connection conn = DatabaseConnection.getConnection(); //
                PreparedStatement pstmt = conn.prepareStatement(parseInfo);){

                pstmt.setString(1, studID);
                ResultSet rs = pstmt.executeQuery();

                if(rs.next()) {
                    String address = rs.getString("stud_address");
                    String sex = rs.getString("stud_sex");

                    System.out.println("Found address: " + address); // Debug line
                    System.out.println("Found sex: " + sex); // Debug line

                    frame.getAddTextField().setText(address != null ? address : "");
                    frame.getSexComboBox().setSelectedItem(sex != null ? sex : "M");
                } else {
                    System.out.println("No record found for ID: " + studID); // Debug line
                }

                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error loading additional data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

