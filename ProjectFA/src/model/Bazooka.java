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
public class Bazooka extends Spelobject
{

    public Bazooka() 
    {
     try {
            plaatje = ImageIO.read(new File("doolhofPlaatjes//bazooka.png"));
        } catch (IOException e) {
        }
          
    }
   
    
}
