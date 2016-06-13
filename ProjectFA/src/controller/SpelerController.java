/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Speler;
import model.Vakje;

/**
 *
 * @author Frank
 */
public class SpelerController 
{
    private Speler speler;
    Vakje[][] vakjes;
    
    public SpelerController(Speler speler, Vakje[][] vakjes)
    {
        this.speler = speler;
        this.vakjes = vakjes;
    }
    
    
}
