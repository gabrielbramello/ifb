/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double f = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit"));
        Temperatura t = new Temperatura();
        JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é: "+t.FparaK(f));
    }
    
}

class Temperatura{
    double FparaK(double fahrenheit){
        double kelvin;
        kelvin = (5.0/9.0)*(fahrenheit + 459.67);
        return kelvin;
    }
}