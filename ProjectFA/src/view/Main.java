/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author Frank
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Doolhof Frank & Amit");
        frame.setSize(1000,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        Spelpaneel spelpaneel = new Spelpaneel();
        //Menupaneel menupaneel = new Menupaneel(spelpaneel);
          
        //frame.add(menupaneel);
        spelpaneel.setFocusable(true);  
        spelpaneel.requestFocus();
       
        frame.add(spelpaneel);
        frame.setVisible(true);
    }
    
}
