/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int primo = 0;

        for (int i = 1; i <= 1000; i++) {            
            for (int j = 1; j <= 1000; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                primo++;
                cont = 0;
            } else {
                cont = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Existem " + primo + " numero primos de 1 a 1000");
    }

}
