/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Frank
 */
public class Spelobject {
    
    protected BufferedImage plaatje;
    
    public Spelobject()
    {
        
        try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//zand.png"));
        } catch (IOException e) {
        }

    }
    
    public Image getPlaatje()
    {
       return plaatje; 
    }
    
   
    
}
