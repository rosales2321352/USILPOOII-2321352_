/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel.controles;

import javax.swing.JButton;
import javax.swing.JPanel;



public class Button {

public static void addButton(JPanel panel){
    JButton button = new JButton();
    button.setText("Click");
    button.setBounds(0,0,100,40);
    panel.add(button);
   
    }
}