/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import project.Login;

/**
 *
 * @author Lakshitha Kavindra
 */
public class splashClass {
      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
          splash sp=new splash();
            sp.setVisible(true);
            Login l=new Login();

        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(50);
            sp.jLabel1.setText(Integer.toString(i));
            sp.jProgressBar1.setValue(i);
            if(i==100){
                sp.setVisible(false);
                l.setVisible(true);
            }
            }

    }catch(Exception e){
           
    }

      }}