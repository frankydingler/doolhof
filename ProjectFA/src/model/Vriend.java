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
public class Vriend extends Spelobject
{
     BufferedImage plaatje;
    public Vriend(int xPositie, int yPositie) {
        super(xPositie, yPositie);
        
         try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//vriend.png"));
        } catch (IOException e) {
        }
    }
    
      public BufferedImage getPlaatje()
    {
        return plaatje;
    }
    
}
