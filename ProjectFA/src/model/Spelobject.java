/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;

/**
 *
 * @author Frank
 */
public class Spelobject {
    
    private int xPositie;
    private int yPositie;
    private HashMap buren;
    private BufferedImage plaatje;
    
    public Spelobject(int xPositie, int yPositie)
    {
        this.xPositie = xPositie;
        this.yPositie = yPositie;
        
        buren = new HashMap();
        
         try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//gras.png"));
        } catch (IOException e) {
        }
    }
    
    public void setBuur(String buur, Spelobject spelobject)
    {
        buren.put(buur, spelobject);
    }
    
    public Spelobject getBuur(String buur)
    {
        return (Spelobject)buren.get(buur);
    }
    
    public void setXPositie(int xPositie)
    {
        this.xPositie = xPositie;
    }
    
    public void setYPositie(int yPositie)
    {
        this.yPositie = yPositie;
    }
    
    public int getXPositie()
    {
        return xPositie;
    }
    
    public int getYPositie()
    {
        return yPositie;
    }
    
    public BufferedImage getPlaatje()
    {
        return plaatje;
    }
    
}
