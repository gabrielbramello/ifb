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
        double num1;
        double num2;
        Ordem ordem = new Ordem();
        
        num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        
        ordem.crescente(num1, num2);
    }
    
}

class Ordem{
    void crescente(double a, double b){
        if(a>b){
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: "+b+", "+a);
        }
        else{
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: "+a+", "+b);
        }
    }
}
