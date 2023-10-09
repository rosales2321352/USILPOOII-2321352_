/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel;

import core.panel.controles.Boton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

/**
 *
 * @author rosales1015
 */
public class MainPanel extends JPanel implements Runnable{
    
    private Thread mainThread;
    
    public MainPanel(){ 
       this.setPreferredSize(new DimensionUIResource(500,500));
       this.setBackground(Color.WHITE);
       this.setDoubleBuffered(true);
       this.setFocusable(true);
       this.DrawControl();
    }
    private void DrawControl(){
        Boton.colocarBotones(this);
    }
    public void startPanelThread(){
        mainThread = new Thread(this);
        mainThread.start();
    }
    
    @Override
    public void run(){
        
        
        
    }
    
    public void update(){
        
    }
    
}
