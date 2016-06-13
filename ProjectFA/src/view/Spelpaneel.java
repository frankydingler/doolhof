/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import model.Speler;
import controller.LevelController;
import controller.SpelerController;
import model.Level;
import model.Muur;
import model.Spelobject;
import model.Vakje;

/**
 *
 * @author Frank
 */
public class Spelpaneel extends JPanel implements KeyListener
{
        private Level level;
        private Speler speler;
        private LevelController levelController;
        private SpelerController spelerController;
        
        public Spelpaneel()
        {
            setSize(1000,600);
            setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
            addKeyListener(this);
            
            speler = new Speler();
            levelController = new LevelController();  
            level = new Level(speler);
            spelerController = new SpelerController(speler, level.getVakjes());
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
        
    }

    
    /**
 *

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
    * 
    *  * @author Frank
 */

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
        @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       Vakje[][] vakjes = level.getVakjes();
        for (int x = 0; x < 15; x++)
        { 
            for (int y = 0; y < 15; y++)
            {
                try
                {
                    g.drawImage(new Spelobject().getPlaatje(), x*40+200, y*40 +75, 40,40, this);
                    g.drawImage(vakjes[x][y].getSpelObject().getPlaatje(), x*40+200, y*40 +75, 40,40, this);
                }
                catch(Exception e){}
                
            }
        }
    }
    
    
    
    
}
