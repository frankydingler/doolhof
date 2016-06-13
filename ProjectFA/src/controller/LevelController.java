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
    
    
    public LevelController()
    {
        level = new String[15];
        huidigLevel = "level1";
        
        
        
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
            for (int i = 0; i < 15; i++)
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
    
}
