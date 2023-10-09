/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.panel.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Button {

    public static void addButton(JPanel panel) {
        JButton button = new JButton();
        button.setText("Click");

        // Usar FlowLayout para que el botón se ajuste automáticamente al tamaño del panel
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(button);
    }
}

