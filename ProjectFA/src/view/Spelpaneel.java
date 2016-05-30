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
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
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
        private int xpos,ypos;
        
        public Spelpaneel()
        {
            
            requestFocus();
           objectlijst = new Spelobject[10][10];
           setSize(1000,600);
           setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
           addKeyListener(this);
           maakLijst();
           setBackground(Color.yellow);
        }
        
        private void maakLijst() //dit is eigenlijk maak level
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
        //    beweeg();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        
        for(int x = 0; x < 10; x++) //zoeken in 2D array
        {
            for(int y = 0; y< 10;y++) //zoeken in 2D array
            {
                try
                {
                    if(objectlijst[x][y] instanceof Muur)
                    {
                        g.setColor(Color.GRAY);
                        g.fillRect(x*40+300, y*40+300, 40, 40);
                        g.setColor(Color.BLACK);
                    }
                    else
                    {                       
                        g.drawRect(x*40+300, y*40+300, 40, 40);
                    }
                }
                catch(Exception e)
                {
                    
                }
                 
                
            }
        }
    }
    

}
