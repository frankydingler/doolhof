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
 * @author Amit
 */
public class Muur extends Spelobject{
    
    BufferedImage plaatje;
    
    public Muur(int xPositie, int yPositie) 
    {
        super(xPositie, yPositie);
        
         try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//muur.png"));
        } catch (IOException e) {
        }
     } 
    
    public BufferedImage getPlaatje()
    {
        return plaatje;
    }
}
    
