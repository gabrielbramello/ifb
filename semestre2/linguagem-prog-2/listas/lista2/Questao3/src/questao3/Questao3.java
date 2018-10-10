/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius;
        
        Temperatura temp = new Temperatura();
        
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        
        JOptionPane.showMessageDialog(null, "A conversão para Fahreheit é: " +temp.celsiusParaFahrenheit(celsius));
    }
    
}

class Temperatura{
    
    double celsiusParaFahrenheit(double celsius){
        double fahrenheit;
        
        fahrenheit = ((9*celsius)/5)+32.0;
        
        return fahrenheit;
    }
}