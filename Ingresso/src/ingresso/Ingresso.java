/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresso;

import ingresso.view.TelaIngressos;

/**
 *
 * @author gabri
 */
public class Ingresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaIngressos principal = new TelaIngressos();
        principal.pack();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
}
