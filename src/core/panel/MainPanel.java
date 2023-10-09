/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel;


import core.panel.controles.Button;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;


/**
 *
 * @author rosales1015
 */
public class MainPanel extends JPanel {

    public MainPanel() {
        //OJO Acá no es necesario colocar el tamaño del panel pero lo coloco porque no puedo ver las diferencias en mi netBeans
        this.setPreferredSize(new DimensionUIResource(500,500));
        this.setBackground(Color.WHITE);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.DrawControl();
    }

    private void DrawControl() {
        Button.addButton(this);
    }
}
    
 
    

