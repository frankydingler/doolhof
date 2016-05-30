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
import javax.swing.JButton;
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
        private Speler speler;
        
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
        
        public void setFocus()
        {
            this.requestFocusInWindow();
        }
        
        private void maakLijst() //dit is eigenlijk maak level
        { 
            Muur muur = new Muur(0,0);
            objectlijst [0][0] = muur;
            
            Muur muur2 = new Muur(5,5);
            objectlijst[5][5] = muur2;
            
            speler = new Speler(2,5);
            objectlijst[2][5] = speler;
            
            for(int i = 0;i<10;i++)
            {
                Muur muuru = new Muur(9,i);
                objectlijst [9][i] = muuru;
            }
            
        }
        
        

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
           int x = speler.getXPositie();
           int y = speler.getYPositie();
           
           if(objectlijst[x+1][y] instanceof Muur)
           {
               
           }
           else
           {
              objectlijst[x+1][y] = speler;
              objectlijst[x][y] = null; 
              speler.setXPositie(x+1);
              repaint();
           }
           
        }
        if(ke.getKeyCode() == KeyEvent.VK_LEFT)
        {
           int x = speler.getXPositie();
           int y = speler.getYPositie();
           
           if(objectlijst[x-1][y] instanceof Muur)
           {
               
           }
           else
           {
              objectlijst[x-1][y] = speler;
              objectlijst[x][y] = null; 
              speler.setXPositie(x-1);
              repaint();
           }
           
        }
        if(ke.getKeyCode() == KeyEvent.VK_UP)
        {
           int x = speler.getXPositie();
           int y = speler.getYPositie();
           
           if(objectlijst[x][y-1] instanceof Muur)
           {
               
           }
           else
           {
              objectlijst[x][y-1] = speler;
              objectlijst[x][y] = null; 
              speler.setYPositie(y-1);
              repaint();
           }
           
        }
        if(ke.getKeyCode() == KeyEvent.VK_DOWN)
        {
           int x = speler.getXPositie();
           int y = speler.getYPositie();
           
           if(objectlijst[x][y+1] instanceof Muur)
           {
               
           }
           else
           {
              objectlijst[x][y+1] = speler;
              objectlijst[x][y] = null; 
              speler.setYPositie(y+1);
              repaint();
           }
           
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
                        g.drawRect(x*40+300, y*40+300, 40, 40);
                    }
                    else if(objectlijst[x][y] instanceof Speler)
                    {
                        g.drawRect(x*40+300, y*40+300, 40, 40);
                        g.setColor(Color.red);
                        g.fillOval(x*40+300, y*40+300, 40, 40);
                        g.setColor(Color.BLACK);
                        g.fillOval(x*40+308, y*40+308, 10, 10);
                        g.fillOval(x*40+322, y*40+308, 10, 10);
                        g.fillRect(x*40+308, y*40+325, 24, 3);
                        
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
