/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel;

import javax.swing.JFrame;

/**
 *
 * @author rosales1015
 */
public  class App {
 
    public static void _init(){
        JFrame window = new JFrame();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Sistema de Inventario");
        
        MainPanel mainPanel = new MainPanel();
        
        window.add(mainPanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        mainPanel.startPanelThread();
        
    }
    
}
