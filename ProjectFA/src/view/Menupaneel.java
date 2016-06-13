/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.KnopController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Frank
 */
public class Menupaneel extends JPanel
{
    private JButton startKnop, resetKnop, maaklevel;
    private Spelpaneel spelpaneel;
    
    public Menupaneel(Spelpaneel spelpaneel)
    {
        this.spelpaneel = spelpaneel;
        setSize(984,200);
        setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        
        
        startKnop = new JButton("Start");
        resetKnop = new JButton("Reset");
        maaklevel = new JButton("Maak Level");
        
        KnopController kh = new KnopController(this);
        
        
        maaklevel.addActionListener(kh);
        startKnop.addActionListener(kh);
        resetKnop.addActionListener(kh);
        
        add(startKnop);
        add(resetKnop);
        add(maaklevel);
        
        
        
    }
    
    public Spelpaneel getSpelpaneel()
    {
        return spelpaneel;
    }
    
    public JButton getStartKnop()
    {
        return startKnop;
    }
    
    public JButton getresetKnop()
    {
        return resetKnop;
    }
    
    public JButton getMaaklevel()
    {
        return maaklevel;
    }
    
}
