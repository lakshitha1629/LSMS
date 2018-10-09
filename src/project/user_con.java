/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import System.DB;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Madushka
 */


public class user_con{
    
public static void main(String[] args) {
    
    //String username = jTextField1.getText();
    //String a=new Login().getClass();
    //String username = "lakshitha";
    //ClassLoader a =new Login().action(evt, args);
    Login a =new Login();
    MainMenu b =new MainMenu();
    Admin_MainMenu c =new Admin_MainMenu();
    
        try{
            String username = a.getName("username");
            Statement stmt = new DB().getConnection().createStatement();
            String query = "SELECT name FROM userdetails WHERE username='"+username+"'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                //gJOptionPane.showMessageDialog(null, "hariiiiiiii");
        
        
        
        }else{
            
            
            
            }
}catch(Exception e){

}
}
}
