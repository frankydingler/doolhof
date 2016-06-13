/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Frank
 */
public class Vakje 
{
    private int xPositie, yPositie;
    private Spelobject spelObject;
    private HashMap<String, Vakje> buren;
    
    public Vakje(int xPositie, int yPositie, Spelobject spelObject)
    {
        this.xPositie = xPositie;
        this.yPositie = yPositie;
        this.spelObject = spelObject;
        buren = new HashMap<String, Vakje>();
    }

    public int getxPositie() {
        return xPositie;
    }

    public void setxPositie(int xPositie) {
        this.xPositie = xPositie;
    }

    public int getyPositie() {
        return yPositie;
    }

    public void setyPositie(int yPositie) {
        this.yPositie = yPositie;
    }

    public Spelobject getSpelObject() {
        return spelObject;
    }

    public void setSpelObject(Spelobject spelObject) {
        this.spelObject = spelObject;
    }
    
    public void setLinkerBuur( Vakje vakje)
    {
        buren.put("links", vakje);
    }
    
    public void setRechterBuur( Vakje vakje)
    {
        buren.put("rechts", vakje);
    }
    
    public void setBovenBuur( Vakje vakje)
    {
        buren.put("boven", vakje);
    }
    
    public void setOnderBuur( Vakje vakje)
    {
        buren.put("onder", vakje);
    }
 
    
}
