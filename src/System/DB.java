/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakshitha Kavindra
 */
public class DB {
    Connection con;

    public Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        //String driver = "org.sqlite.JDBC";
        String url = "jdbc:mysql://localhost:3306/lsms1";
        //String url ="jdbc:sqlite:C:\\Users\\Lakshitha Kavindra\\Documents\\NetBeansProjects\\Project\\Database\\Mydatabase.sqlite";
        String username = "root";
        String password = "";
            try{
                Class.forName(driver);
                con = DriverManager.getConnection(url,username, password);
                //JOptionPane.showMessageDialog(null, "connected");
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
