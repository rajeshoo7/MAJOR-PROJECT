/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coextractingopinion;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Rajesh
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        System.out.println("Here");
        try
        {                    
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");                         
            
            HomePage hp=new HomePage();
            hp.setResizable(false);
            hp.setTitle("Home Page");
            hp.setVisible(true);  
        }
	catch (Exception ex)
	{
            System.out.println("Failed loading L&F: ");
            System.out.println(ex);
	}        
    }
}
