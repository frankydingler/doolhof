/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Amit
 */
public class Muur extends Spelobject{
    
    BufferedImage image;
    
    public Muur(int xPositie, int yPositie) {
        super(xPositie, yPositie);
  /*      
        try{
            setImage(ImageIO.read(new File("src/doolhofplaatjes/muur.png")));
        }
        catch(Exception e) {
            System.out.println(e + " fout bij inladen van de image.");
        }
 */
    } 
}
    
