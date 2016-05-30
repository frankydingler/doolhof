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
import model.Bazooka;
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
        private Speler speler;
        private boolean gebruikBazooka;
        
        public Spelpaneel()
        {
            gebruikBazooka = false;
            requestFocus();
           objectlijst = new Spelobject[10][10];
           setSize(1000,600);
           setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
           addKeyListener(this);
           maakLijst();
           setBackground(Color.yellow);
        }
        
        private void maakLijst() //dit is eigenlijk maak level tekenen van hokjes
        { 
                speler = new Speler(1,1); // naar beneden links
                objectlijst[1][1] = speler;
                
                Bazooka bazooka = new Bazooka(1,8);
                objectlijst[1][8] = bazooka;

            
            //for loop, teken muur, mag niet groter zijn dan 9 en i++
            
            for (int i = 0; i < 10; i++)
            {
                Muur muur1 = new Muur(0,i); // naar beneden links
                objectlijst[0][i] = muur1;
                
                Muur muur2 = new Muur(9,i); // naar beneden rechts
                objectlijst[9][i] = muur2;
                
                Muur muur3 = new Muur(i,0); // naar rechts boven
                objectlijst[i][0] = muur3;
                
                Muur muur4 = new Muur(i,9); // naar rechts beneden
                objectlijst[i][9] = muur4;
                
            }                    
            
            for (int i = 1; i < 2; i++) // blokken van 3 in het midden
            {
                Muur muur1 = new Muur(4,i); // naar beneden links
                objectlijst[4][i] = muur1;
                
                Muur muur2 = new Muur(7,i); // naar beneden rechts
                objectlijst[7][i] = muur2;
                
                Muur muur3 = new Muur(i,5); // naar rechts boven
                objectlijst[i][5] = muur3;
                
                Muur muur4 = new Muur(i,7); // naar rechts beneden
                objectlijst[i][7] = muur4;
                
                Muur muur5 = new Muur(i,2); // naar rechts beneden
                objectlijst[i][2] = muur5;
                

            }                    
            
            for (int i = 5; i < 7; i++) // blokken van 3 in het midden
            {
                Muur muur1 = new Muur(4,i); // naar beneden links
                objectlijst[4][i] = muur1;
                
                Muur muur2 = new Muur(i,5); // naar beneden links
                objectlijst[i][5] = muur2;
                
                Muur muur3 = new Muur(i,7); // naar beneden links
                //objectlijst[i][7] = muur3;

                
            }
            
                Muur muur1 = new Muur(7,7); 
                objectlijst[7][7] = muur1;
                
                Muur muur2 = new Muur(5,2); 
                objectlijst[5][2] = muur2;
                
                Muur muur3 = new Muur(3,7); 
                objectlijst[3][7] = muur3;
                
                Muur muur4 = new Muur(7,3); 
                objectlijst[7][3] = muur4;
                
                Muur muur5 = new Muur(8,4); 
                objectlijst[8][4] = muur5;
                
                Muur muur6 = new Muur(5,8);
                objectlijst[5][8] = muur6;
                
                Muur muur7 = new Muur(3,7); 
                objectlijst[3][7] = muur7;
                
                Muur muur8 = new Muur(2,3); 
                objectlijst[2][3] = muur8;
                
                Muur muur9 = new Muur(5,4); 
                objectlijst[5][4] = muur9;
                
                Muur muur10 = new Muur(2,5); 
                objectlijst[2][5] = muur10;
                
                Muur muur11 = new Muur(3,3); 
                objectlijst[3][3] = muur11;
                
                Muur muur12 = new Muur(7,3); 
                objectlijst[7][6] = muur12;
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
               if(gebruikBazooka)
               {
                   objectlijst[x+1][y] = null;
                   speler.setBaazoka(false);
                   repaint();
                   gebruikBazooka = false;
               }
           }
           else
           {
              if(objectlijst[x+1][y] instanceof Bazooka)
              {
                  speler.setBaazoka(true);
              }
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
               if(gebruikBazooka)
               {
                   objectlijst[x-1][y] = null;
                   speler.setBaazoka(false);
                   repaint();
                   gebruikBazooka = false;
               }
               
           }
           else
           {
              if(objectlijst[x-1][y] instanceof Bazooka)
              {
                  speler.setBaazoka(true);
              }
              objectlijst[x-1][y] = speler;
              objectlijst[x][y] = null; 
              speler.setXPositie(x-1);             
              repaint();
           }
           
        }
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(speler.getBaazoka())
               {
                   gebruikBazooka = true;
               }
  
        }
        if(ke.getKeyCode() == KeyEvent.VK_UP)
        {
           int x = speler.getXPositie();
           int y = speler.getYPositie();
           
           if(objectlijst[x][y-1] instanceof Muur)
           {
             if(gebruikBazooka)
               {
                   objectlijst[x][y-1] = null;
                   speler.setBaazoka(false);
                   repaint();
                   gebruikBazooka = false;
               }
           }
           else
           {
              if(objectlijst[x][y-1] instanceof Bazooka)
              {
                  speler.setBaazoka(true);
              }
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
               if(gebruikBazooka)
               {
                   objectlijst[x][y+1] = null;
                   speler.setBaazoka(false);
                   repaint();
                   gebruikBazooka = false;
               }
           }
           else
           {
              if(objectlijst[x][y+1] instanceof Bazooka)
              {
                  speler.setBaazoka(true);
              }
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
        g.drawString("Hallo", 20, 20);
        
        for(int x = 0; x < 10; x++) //zoeken in 2D array
        {
            for(int y = 0; y< 10;y++) //zoeken in 2D array
            {
                try
                {
                    if(objectlijst[x][y] instanceof Muur)
                    {
                        
                        g.setColor(Color.GRAY);
                        g.fillRect(x*40+300, y*40+50, 40, 40);
                        g.setColor(Color.BLACK);
                        g.drawRect(x*40+300, y*40+50, 40, 40);
                    }
                    else if(objectlijst[x][y] instanceof Speler)
                    {
                        
                        if(speler.getBaazoka())
                        {
                            g.setColor(Color.green); 
                        }
                        else
                        {
                           g.setColor(Color.red); 
                        }
                        
                        g.fillOval(x*40+300, y*40+50, 38, 38);
                        g.setColor(Color.BLACK);
                        if(speler.getBaazoka())
                        {
                            g.setColor(Color.yellow);
                        }
                        g.fillOval(x*40+308, y*40+58, 10, 10);
                        g.fillOval(x*40+322, y*40+58, 10, 10);
                        g.fillRect(x*40+308, y*40+75, 24, 3);
                        g.setColor(Color.BLACK);
                    }
                    else if(objectlijst[x][y] instanceof Bazooka)
                    {
                        g.setColor(Color.darkGray);
                        g.fillRect(x*40+308, y*40+58, 8, 28);
                        g.fillOval(x*40+308, y*40+58, 28, 18);
                        g.setColor(Color.BLACK);
                    }
                    else
                    {                       
                        
                    }
                }
                catch(Exception e)
                {
                    
                }
                 
                
            }
        }
    }

    public void setFocus() 
    {
        this.grabFocus();
    }
    

}
