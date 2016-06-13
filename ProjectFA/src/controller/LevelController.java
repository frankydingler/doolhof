/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Frank
 */
public class LevelController 
{
    private Scanner scanner;
    private String[] level;
    private String huidigLevel;
    
    private BufferedImage spelerPlaatje, muurPlaatje ,zandPlaatje;
    
    public LevelController()
    {
        level = new String[14];
        huidigLevel = "level1";
        
        try {
            spelerPlaatje = ImageIO.read(new File("doolhofPlaatjes//speler.png"));
        } catch (IOException e) {
        }
        
        try {
            muurPlaatje = ImageIO.read(new File("doolhofPlaatjes//muur.png"));
        } catch (IOException e) {
        }
        
        try {
            zandPlaatje = ImageIO.read(new File("doolhofPlaatjes//zand.png"));
        } catch (IOException e) {
        }
        
        
        laadLevel();
        setLevel();
    }
    
    public void setHuidigLevel(String huidigLevel)
    {
        this.huidigLevel = huidigLevel;
    }
    
    public String getHuidigLevel()
    {
        return huidigLevel;
    }
    
    public void laadLevel(){
        //File file = new File("c://ISO//map.txt");
        
        try{
            scanner = new Scanner(new File("levels//"+huidigLevel+".txt"));
        }
        catch(Exception e){
            System.out.println("Fout " + e);
        }
    }
    
    public void setLevel(){
        while(scanner.hasNext()){
            for (int i = 0; i < 14; i++)
            {
                level[i] = scanner.next();
            }
        }
        scanner.close();
    }
    
    public String getLevel(int x, int y){
        String index = level[y].substring(x, x + 1);
        return index;
    }
    
    public Image getZand()
    {
        return zandPlaatje;
    }
    
    public Image getMuur()
    {
        return muurPlaatje;
    }
}
