/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Frank
 */
public class LevelmakerMenu extends JPanel
{
    private JButton maakLevelKnop;
    private JRadioButton muurRadio, spelerRadio;
    
    public LevelmakerMenu()
    {
        maakLevelKnop = new JButton("add");
        add(maakLevelKnop);
    }
    
}
