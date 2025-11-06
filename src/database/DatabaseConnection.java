/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;

public class DatabaseConnection {
    
  
    private static final String URL = "jdbc:mysql://localhost:3306/athlete_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Ndomingo30!"; 

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database not found!" + e.getMessage());
        }
       
        return con;
    }
    
}
    
    
    

