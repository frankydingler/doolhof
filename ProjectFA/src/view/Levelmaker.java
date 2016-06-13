/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import model.Muur;
import model.Spelobject;

/**
 *
 * @author Frank
 */
public class Levelmaker extends JPanel implements MouseListener
{
    
    private Spelobject[][] objectlijst;
    
    public Levelmaker()
    {
        addMouseListener(this);
        objectlijst = new Spelobject[10][10];
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        for(int x=0;x<10;x++)
        {
            for(int y=0;y<10;y++)
            {
                if(objectlijst[x][y] instanceof Muur)
                {
                    g.setColor(Color.RED);
                    g.fillRect(x*35+5, y*35+45, 35, 35);
                }
                else
                {
                    g.setColor(Color.black);
                    g.drawRect(x*35+5, y*35+45, 35, 35);
                }
                
            }
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println(""+me.getX() + " " + me.getY());
        int xpositie = (me.getX()-5) / 35;
        int ypositie = (me.getY()-45) / 35;
        
        //objectlijst[xpositie][ypositie] = new Muur(xpositie, ypositie);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
     
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}
