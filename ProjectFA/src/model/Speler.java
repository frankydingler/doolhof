/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

    public boolean getBaazoka() 
    {
        return bazooka;
        
    }

    public void setBaazoka(boolean baazoka) 
    {
        this.bazooka = baazoka;
    }
    
    public Speler() 
    {
        try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//speler.png"));
        } catch (IOException e) {
        }
         
    }

    
    
}
