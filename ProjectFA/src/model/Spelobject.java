/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Frank
 */
public class Spelobject {
    
    private int xPositie;
    private int yPositie;
    
    public Spelobject(int xPositie, int yPositie)
    {
        this.xPositie = xPositie;
        this.yPositie = yPositie;
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
    
}
