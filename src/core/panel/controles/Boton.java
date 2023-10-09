/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel.controles;

import javax.swing.JButton;
import javax.swing.JPanel;



public class Boton {

public static void colocarBotones(JPanel panel){
    JButton boton1 = new JButton();
    boton1.setText("Hola");
    boton1.setBounds(0,0,100,40);
    panel.add(boton1);
   
    }
}