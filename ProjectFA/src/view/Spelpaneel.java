/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Frank
 */
public class Spelpaneel extends JPanel implements KeyListener
{
        public Spelpaneel()
        {
           setSize(1000,600);
           JLabel label = new JLabel("hallo");
           addKeyListener(this);
           add(label);
        }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            JOptionPane.showMessageDialog(this, "hallo");
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
   
