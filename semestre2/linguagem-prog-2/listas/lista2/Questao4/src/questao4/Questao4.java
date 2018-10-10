/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cotacDolar;
        double somaCotac=0;
        double mediaCotac;
        
        for(int i=0; i<7; i++){
            cotacDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite as sete últimas cotações do dolar.\n"));
            somaCotac+=cotacDolar;
        }
        mediaCotac = somaCotac/7;
        
        JOptionPane.showMessageDialog(null, "A cotação do Dólar essa semana foi de R$"+mediaCotac);
    }
    
}
