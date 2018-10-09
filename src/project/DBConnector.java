package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import project.*;
import System.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Pranavan
 */
public class DBConnector {
         String DB_Driver="com.mysql.jdbc.Driver";
         String DB_URL="jdbc:mysql://localhost:3306/lsms1";
         String DB_USER="root";
         String DB_PASSWRD="";
        Connection con= null;
       
        public Connection getConnection(){
            try{
                Class.forName(DB_Driver);
                con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWRD);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "DB Connection Error!", JOptionPane.ERROR_MESSAGE);
            }
        return con;
        }
}
