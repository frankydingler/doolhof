/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
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
        frame.setLayout(new BorderLayout());
        frame.setSize(1000, 800);
        frame.setTitle("Doolhof Frank & Amit");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        Spelpaneel spelpaneel = new Spelpaneel();
        spelpaneel.setFocusable(true);  
        Menupaneel menupaneel = new Menupaneel(spelpaneel);
        frame.add(menupaneel, BorderLayout.NORTH);
        frame.add(spelpaneel, BorderLayout.CENTER);      
        spelpaneel.requestFocus();  
        frame.add(spelpaneel);
        frame.setVisible(true);
        spelpaneel.setFocus();
    }
    
}
