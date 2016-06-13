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
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import model.Bazooka;
import model.Helper;
import model.Muur;
import model.Speler;
import model.Spelobject;
import model.Vriend;
import controller.LevelController;

/**
 *
 * @author Frank
 */
public class Spelpaneel extends JPanel implements KeyListener
{
        private Spelobject[][] objectlijst;
        private Speler speler;
        private Helper helper;
        private Vriend vriend;
        private int counter;
        private boolean gebruikBazooka;
        private BufferedImage plaatje;
        private LevelController levelController;
        
        public Spelpaneel()
        {
            levelController = new LevelController();
            gebruikBazooka = false;
            objectlijst = new Spelobject[10][10];
            setSize(1000,600);
            setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
            addKeyListener(this);
        }
        

        public void setFocus() 
        {
            this.grabFocus();
        }
        
        public void resetLevel()
        {
            
        }
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
           counter++;
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
            counter++;
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
              else if(objectlijst[x-1][y] instanceof Helper)
              {
                  
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
            counter++;
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
            counter++;
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
    
    public void paint(Graphics g){
       super.paint(g);
       g.setColor(Color.BLACK);
        for (int y = 0; y < 14; y++)
        { 
            for (int x = 0; x < 14; x++)
            {
                try
                {
                    if(levelController.getLevel(x , y).equals("g"))
                    {
                        System.out.println("" + y+x);
                       g.drawImage(levelController.getZand(), x * 32, y * 32, this);
                    }
                    if(levelController.getLevel(x , y).equals("w"))
                    {
                        g.drawImage(levelController.getMuur(), x * 32, y * 32, this);
                    }
                }
                catch(Exception e){}
                
            }
        }
    }
    
    
    
    
}
