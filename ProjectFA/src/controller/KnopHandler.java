/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import view.Levelmaker;
import view.LevelmakerMenu;
import view.Menupaneel;
import view.Spelpaneel;

/**
 *
 * @author Frank
 */
public class KnopHandler implements ActionListener
{
    private Menupaneel menupaneel;
    
    public KnopHandler(Menupaneel menupaneel)
    {
        this.menupaneel = menupaneel;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == menupaneel.getMaaklevel())
        {
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());
            frame.setTitle("Levelmaker Frank & Amit");
            frame.setSize(600,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
            Levelmaker levelmaker = new Levelmaker();
            levelmaker.setSize(400,400);
            LevelmakerMenu levelmakerMenu = new LevelmakerMenu();
            frame.add(levelmakerMenu,BorderLayout.EAST);
            frame.add(levelmaker,BorderLayout.CENTER);
            frame.setVisible(true);
        }
        if(e.getSource() == menupaneel.getresetKnop())
        {
            menupaneel.getSpelpaneel().resetLevel();
            System.out.println("resetknop");
        }
        if(e.getSource() == menupaneel.getStartKnop())
        {
            menupaneel.getSpelpaneel().setFocus();
            System.out.println("startknop");
        }
        
    }
    
}
