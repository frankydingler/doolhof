/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Muur;
import model.Speler;
import model.Spelobject;

/**
 *
 * @author Frank
 */
public class Spelpaneel extends JPanel implements KeyListener
{
        private Spelobject[][] objectlijst;
        
        public Spelpaneel()
        {
           objectlijst = new Spelobject[10][10];
           setSize(1000,600);
           JLabel label = new JLabel("hallo");
           addKeyListener(this);
           add(label);
           maakLijst();
        }
        
        private void maakLijst()
        { 
            Muur muur = new Muur(0,0);
            objectlijst [0][0] = muur;
            
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
    
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.black);
        g.fillOval(20, 20, 20, 20);
        
        for(int x = 0; x < 10; x++) //zoeken in 2D array
        {
            for(int y = 0; y< 10;y++) //zoeken in 2D array
            {
                try
                {
                    if(objectlijst[x][y] instanceof Muur)
                {
                    System.out.println("    jaaaa");
                    g.fillOval(x*40+100, y*40+100, 40, 40);
                }
                }
                catch(Exception e)
                {
                    g.drawRect(x*40+100, y*40+100, 40, 40);
                }
                 
                
            }
        }
    }
    
           // Speler speler = new Speler();
           // objectlijst[0][0] = speler;
}
