/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.LevelController;

/**
 *
 * @author Frank
 */
public class Level 
{
    
    private LevelController levelController;
    private Speler speler;
    private Vriend vriend;
    
    public Level(Speler speler)
    {
        levelController = new LevelController();
        this.speler = speler;
        vriend = new Vriend();
    }
    
    public Vakje[][] getVakjes()
    {
        Vakje[][] vakjes = new Vakje[15][15];
        for (int x = 0; x < 15; x++)
        { 
            for (int y = 0; y < 15; y++)
            {
                try
                {
                    if(levelController.getLevel(x , y).equals("z"))
                    {                    
                       vakjes[x][y] = new Vakje(x,y,new Spelobject());
                    }
                    else if(levelController.getLevel(x , y).equals("m"))
                    {
                        vakjes[x][y] = new Vakje(x,y,new Muur());
                    }
                    else if(levelController.getLevel(x , y).equals("b"))
                    {
                        vakjes[x][y] = new Vakje(x,y,new Bazooka());
                    }
                    else if(levelController.getLevel(x , y).equals("p"))
                    {
                        vakjes[x][y] = new Vakje(x,y,new Pestkop());
                    }                   
                    else if(levelController.getLevel(x , y).equals("v"))
                    {
                        vakjes[x][y] = new Vakje(x,y,vriend);
                    }
                    else if(levelController.getLevel(x , y).equals("s"))
                    {
                        vakjes[x][y] = new Vakje(x,y,speler);
                    }
                    else if(levelController.getLevel(x , y).equals("h"))
                    {
                        vakjes[x][y] = new Vakje(x,y,new Helper(speler, vriend));
                    }
                    
                    try
                    {
                        vakjes[x][y].setBovenBuur(vakjes[x][y-1]);                       
                    }
                    catch(Exception e){}
                    try
                    {
                        vakjes[x][y].setLinkerBuur(vakjes[x-1][y]);                       
                    }
                    catch(Exception e){}
                    try
                    {
                        vakjes[x-1][y].setRechterBuur(vakjes[x][y]);                       
                    }
                    catch(Exception e){}
                    try
                    {
                        vakjes[x][y-1].setOnderBuur(vakjes[x][y]);                       
                    }
                    catch(Exception e){}
                    
                }
                catch(Exception e){}
                
            }
        }
        return vakjes;
    }
}
