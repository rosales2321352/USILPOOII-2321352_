/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controls;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author rosales1015
 */
public class Button {
    
    public static void addButton(JPanel panel){
        JButton boton = new JButton("Mi Botón");
       boton.setBounds(0, 0, 100, 100);
       panel.add(boton);
    }
    
}
