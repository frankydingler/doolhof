/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Frank
 */
public class Speler extends Spelobject
{
    private boolean bazooka;
    BufferedImage plaatje, plaatjeBazooka;
    

    public boolean getBaazoka() 
    {
        return bazooka;
        
    }

    public void setBaazoka(boolean baazoka) 
    {
        this.bazooka = baazoka;
    }
    
    public Speler(int xPositie, int yPositie) 
    {
        super(xPositie, yPositie);
        
         try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//speler.png"));
        } catch (IOException e) {
        }
         try {
            plaatjeBazooka = ImageIO.read(new File("doolhofPlaatjes//spelerBazooka.png"));
        } catch (IOException e) {
        }
         
    }
    
     public BufferedImage getPlaatje()
    {
        if(bazooka)
            return plaatjeBazooka;
        else
        return plaatje;
    }
    
    
    
    
    
    
    
    
}
