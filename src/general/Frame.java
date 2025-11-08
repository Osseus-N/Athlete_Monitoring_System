/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package general;

import javax.swing.table.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Frame extends javax.swing.JFrame implements ActionListener {

      private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame.class.getName());
    public DefaultTableModel model;
    BasicFunction function = new BasicFunction(this);
    public Frame() {

        initComponents();
        setLocationRelativeTo(null);
        String[] columnName = {"Athlete ID","Name", "Age", "Year Level", "Course", "Sport"};
        model = new DefaultTableModel(columnName, 0);
        athleteTable.setModel(model);

       function.loadTableData();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        firstName = new javax.swing.JLabel();
        studIdTextField = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        lNTextField = new javax.swing.JTextField();
        middleInitial = new javax.swing.JLabel();
        fNTextField = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        mITextField = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addTextField = new javax.swing.JTextField();
        sutdId = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        sex = new javax.swing.JLabel();
        sexComboBox = new javax.swing.JComboBox<>();
        formSeperator = new javax.swing.JSeparator();
        sportL = new javax.swing.JLabel();
        sportCombobox = new javax.swing.JComboBox<>();
        yearLevel = new javax.swing.JLabel();
        yearLevelComboBox = new javax.swing.JComboBox<>();
        course = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();
        selectIDLabel = new javax.swing.JLabel();
        selectedID = new javax.swing.JLabel();
        northPanel = new javax.swing.JPanel();
        btnPanel = new javax.swing.JPanel();
        aboutBtn = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        athletePane = new javax.swing.JScrollPane();
        athleteTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1255, 850));
        setResizable(false);

        mainPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        mainPanel.setMinimumSize(new java.awt.Dimension(1200, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(1200, 800));
        mainPanel.setLayout(new java.awt.BorderLayout());

        leftPanel.setBackground(new java.awt.Color(55, 108, 138));
        leftPanel.setPreferredSize(new java.awt.Dimension(250, 800));
        leftPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setBackground(new java.awt.Color(55, 108, 138));
        formPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formPanel.setPreferredSize(new java.awt.Dimension(250, 500));

        firstName.setForeground(new java.awt.Color(249, 247, 240));
        firstName.setLabelFor(fNTextField);
        firstName.setText("First Name:");
        firstName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        firstName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        studIdTextField.setToolTipText("");
        try {

            MaskFormatter idMask = new MaskFormatter("##-####");
            idMask.setValidCharacters("0123456789");
            studIdTextField = new JFormattedTextField(idMask);
            studIdTextField.setColumns(7);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        studIdTextField.addActionListener(this);

        age.setForeground(new java.awt.Color(249, 247, 240));
        age.setText("Age:");

        lNTextField.setToolTipText("");

        middleInitial.setForeground(new java.awt.Color(249, 247, 240));
        middleInitial.setLabelFor(mITextField);
        middleInitial.setText("Middle Initial:");
        middleInitial.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        middleInitial.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        fNTextField.setToolTipText("");

        LastName.setForeground(new java.awt.Color(249, 247, 240));
        LastName.setLabelFor(lNTextField);
        LastName.setText("Last Name:");
        LastName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LastName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        mITextField.setToolTipText("");


        address.setForeground(new java.awt.Color(249, 247, 240));
        address.setText("Address:");

        addTextField.setToolTipText("");

        sutdId.setBackground(new java.awt.Color(249, 247, 240));
        sutdId.setForeground(new java.awt.Color(249, 247, 240));
        sutdId.setText("Student ID:");

        ageTextField.setToolTipText("");

        sex.setForeground(new java.awt.Color(249, 247, 240));
        sex.setText("Sex:");

        sexComboBox.setBackground(new java.awt.Color(249, 247, 240));
        sexComboBox.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"M", "F"}));

        sportL.setForeground(new java.awt.Color(249, 247, 240));
        sportL.setText("Sport :");

        sportCombobox.setBackground(new java.awt.Color(249, 247, 240));
        sportCombobox.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        sportCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Basketball", "Volleyball", "Football", "Badminton ", "Table Tennis ", "Tennis ", "Baseball ", "Softball ", "Track and Field ", "Swimming", "Taekwondo ", "Karate ", "Arnis ", "Chess ", "Esports ", "Sepak Takraw ", "DanceSport ", "Archery", "Shooting ", "Boxing", "Wrestling", "Gymnastics ", "Fencing", "Cycling"}));


        yearLevel.setForeground(new java.awt.Color(249, 247, 240));
        yearLevel.setText("Year Level:");

        yearLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));

        course.setForeground(new java.awt.Color(249, 247, 240));
        course.setText("Course : ");

        courseComboBox.setBackground(new java.awt.Color(249, 247, 240));
        courseComboBox.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"BSA", "BSAB", "BSABE", "BSAEn", "BSF", "BSIT", "BSCE", "BSAcc", "BSBA", "BSE", "BSMA", "BSChem", "BSBio", "BSEnvSci", "BSMath", "BSStat", "BSMet", "BSHM", "BSTFT", "BSTM", "BAFilipino", "BAIS", "BALit", "BASocSci", "BSDC", "BSPsy", "BCaEd", "BECEd", "BEEd", "BPED", "BSEd", "BTLEd"}));


        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
                formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(formSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                                .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(yearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                                .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(190, 190, 190))
                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(sportL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(sportCombobox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(courseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(formPanelLayout.createSequentialGroup()
                                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(studIdTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                                                        .addComponent(fNTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mITextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lNTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(sutdId, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(middleInitial, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(addTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(158, 158, 158))))
        );
        formPanelLayout.setVerticalGroup(
                formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(sutdId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(address)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(age)
                                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sportL)
                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sportCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(formSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        leftPanel.add(formPanel, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(55, 108, 138));

        saveBtn.isOpaque();
        saveBtn.setBackground(new java.awt.Color(249, 247, 240));
        saveBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        saveBtn.setText("Save");
        saveBtn.setActionCommand("Save ");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(this);

        removeBtn.isOpaque();
        removeBtn.setBackground(new java.awt.Color(249, 247, 240));
        removeBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        removeBtn.setText("Remove");
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.addActionListener(this);
        exportBtn.isOpaque();
        exportBtn.setBackground(new java.awt.Color(249, 247, 240));
        exportBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(55, 108, 138)));
        exportBtn.setText("Export");
        exportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportBtn.addActionListener(this);

        selectIDLabel.setForeground(new java.awt.Color(249, 247, 240));
        selectIDLabel.setText(" Selected Athlete ID");

        athleteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int selectedRow=athleteTable.getSelectedRow();

                if(selectedRow != -1){

                    String studID = athleteTable.getValueAt(selectedRow, 0).toString();
                    studIdTextField.setText(studID);
                    selectedID.setText(studID);
                    // Parse full name (format: "FirstName MiddleInitial. LastName")
                    String fullName = athleteTable.getValueAt(selectedRow, 1).toString();
                    String[] nameParts = fullName.split(" ");

                    String firstName = "";
                    String middleInitial = "";
                    String lastName = "";

                    if (nameParts.length >= 3) {
                        firstName = nameParts[0].trim();
                        // Remove the period from middle initial (e.g., "A." -> "A")
                        middleInitial = nameParts[1].replace(".", "").trim();
                        // Last name might be multiple words, so join remaining parts
                        StringBuilder lastNameBuilder = new StringBuilder();
                        for (int i = 2; i < nameParts.length; i++) {
                            lastNameBuilder.append(nameParts[i]);
                            if (i < nameParts.length - 1) lastNameBuilder.append(" ");
                        }
                        lastName = lastNameBuilder.toString().trim();
                    } else if (nameParts.length == 2) {
                        firstName = nameParts[0].trim();
                        lastName = nameParts[1].trim();
                    } else if (nameParts.length == 1) {
                        firstName = nameParts[0].trim();
                    }
                    //set textfield
                    fNTextField.setText(firstName);
                    mITextField.setText(middleInitial);
                    lNTextField.setText(lastName);
                    ageTextField.setText(athleteTable.getValueAt(selectedRow, 2).toString());

                    // Set combo box
                    yearLevelComboBox.setSelectedItem(athleteTable.getValueAt(selectedRow, 3).toString());
                    courseComboBox.setSelectedItem(athleteTable.getValueAt(selectedRow, 4).toString());
                    sportCombobox.setSelectedItem(athleteTable.getValueAt(selectedRow, 5).toString());

                    //use mysql for getting address and sport
                    function.parseInfo();
                }
            }
        });

        selectedID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectedID.setForeground(new java.awt.Color(249, 247, 240));
        selectedID.setText("00-0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                .addComponent(exportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(selectIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(selectedID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(111, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectIDLabel)
                                        .addComponent(selectedID))
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(exportBtn)
                                .addGap(18, 18, 18)
                                .addComponent(removeBtn)
                                .addGap(46, 46, 46))
        );

        leftPanel.add(jPanel1, java.awt.BorderLayout.SOUTH);

        mainPanel.add(leftPanel, java.awt.BorderLayout.WEST);

        northPanel.setBackground(new java.awt.Color(249, 247, 240));
        northPanel.setPreferredSize(new java.awt.Dimension(1200, 100));
        northPanel.setLayout(new java.awt.BorderLayout());

        btnPanel.setBackground(new java.awt.Color(249, 247, 240));
        btnPanel.setAlignmentY(0.8F);
        btnPanel.setPreferredSize(new java.awt.Dimension(500, 100));

        aboutBtn.setBackground(new java.awt.Color(249, 247, 240));
        aboutBtn.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(7, 40, 64));
        aboutBtn.setText("About Us");
        aboutBtn.setAlignmentX(13.0F);
        aboutBtn.setBorder(null);
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.setPreferredSize(new java.awt.Dimension(75, 23));
        aboutBtn.addActionListener(this);
        aboutBtn.setFocusPainted(false);

        
        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
                btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnPanelLayout.createSequentialGroup()
                                .addContainerGap(71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );
        btnPanelLayout.setVerticalGroup(
                btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        northPanel.add(btnPanel, java.awt.BorderLayout.CENTER);
        btnPanel.getAccessibleContext().setAccessibleName("");
        btnPanel.getAccessibleContext().setAccessibleParent(northPanel);

        titlePanel.setBackground(new java.awt.Color(249, 247, 240));
        titlePanel.setPreferredSize(new java.awt.Dimension(700, 100));

        title.setBackground(new java.awt.Color(7, 40, 64));
        title.setFont(new java.awt.Font("Lucida Console", 1, 32)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CLSU ATHLETE MONITORING SYSTEM");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(32, 32, 32))
        );

        northPanel.add(titlePanel, java.awt.BorderLayout.WEST);

        mainPanel.add(northPanel, java.awt.BorderLayout.NORTH);


        athletePane.setBackground(new java.awt.Color(249, 247, 240));
        athletePane.setBorder(null);
        athletePane.setForeground(new java.awt.Color(7, 40, 64));

       
        athletePane.setViewportView(athleteTable);

        mainPanel.add(athletePane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    public JTable getAthleteTable() {
        return athleteTable;
    }

    // Add these getter methods:
    public JTextField getStudIdTextField() {
        return studIdTextField;
    }

    public JTextField getFNTextField() {
        return fNTextField;
    }

  
    public JTextField getMITextField() {
        return mITextField;
    }

    public JTextField getLNTextField() {
        return lNTextField;
    }

    public JTextField getAddTextField() {
        return addTextField;
    }

    public JTextField getAgeTextField() {
        return ageTextField;
    }

    public JComboBox<String> getSexComboBox() {
        return sexComboBox;
    }

    public JComboBox<String> getYearLevelComboBox() {
        return yearLevelComboBox;
    }

    public JComboBox<String> getSportCombobox() {
        return sportCombobox;
    }

    public JComboBox<String> getCourseComboBox() {
        return courseComboBox;
    }

    public String getSelectedID(){
        int selectedRow=athleteTable.getSelectedRow();

        String selectedID = athleteTable.getValueAt(selectedRow, 0).toString();
        return selectedID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JTextField addTextField;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JScrollPane athletePane;
    private javax.swing.JTable athleteTable;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel course;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JTextField fNTextField;
    private javax.swing.JLabel firstName;
    private javax.swing.JPanel formPanel;
    private javax.swing.JSeparator formSeperator;
    private javax.swing.JLabel sportL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNTextField;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField mITextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel middleInitial;
    private javax.swing.JPanel northPanel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel selectIDLabel;
    private javax.swing.JLabel selectedID;
    private javax.swing.JLabel sex;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JComboBox<String> sportCombobox;
    private javax.swing.JTextField studIdTextField;
    private javax.swing.JLabel sutdId;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton exportBtn;
    private javax.swing.JLabel yearLevel;
    private javax.swing.JComboBox<String> yearLevelComboBox;
    // End of variables declaration//GEN-END:variables


    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Frame ui  = new Frame();
            ui.setVisible(true);
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == saveBtn){
        function.saveData();
        }
        else if(source == removeBtn){
            function.removeData();
        }
        else if(source == exportBtn) {
            function.exportData();
        }
        else if(source == aboutBtn) {
            AboutPage aboutPage = new AboutPage()   ;
            aboutPage.setVisible(true);
            dispose();
        }
    }
}