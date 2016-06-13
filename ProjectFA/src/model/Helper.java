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
public class Helper extends Spelobject
{   
    private Speler speler;
    private Vriend vriend;

    public Helper(Speler speler, Vriend vriend) 
    {
        
        this.speler = speler;
        this.vriend = vriend;
        
        try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//helper.png"));
        } catch (IOException e) {
        }
        
    }
    
   
    public void berekenOptimaleRoute()
    {
        
    }
    
    
    
}
