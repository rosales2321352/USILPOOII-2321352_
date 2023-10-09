/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel;

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
       this.setPreferredSize(new DimensionUIResource(768,576));
       this.setBackground(Color.WHITE);
       this.setDoubleBuffered(true);
       this.setFocusable(true);
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
