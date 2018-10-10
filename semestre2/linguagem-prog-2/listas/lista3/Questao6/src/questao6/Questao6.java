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
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        Ordem ordem=new Ordem();
        ordem.ordemCrescente(num1,num2,num3);
    }
    
}

class Ordem{
    void ordemCrescente(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            if(num2>num3){
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num3+", "+num2+", "+num1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num2+", "+num3+", "+num1);
            }
        }
        if(num2>num1 && num2>num3){
            if(num1>num3){
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num3+", "+num1+", "+num2);
            }
            else{
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num1+", "+num3+", "+num2);
            }
        }
        if(num3>num1 && num3>num2){
            if(num1>num2){
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num2+", "+num1+", "+num3);
            }
            else{
                JOptionPane.showMessageDialog(null, "Ordem crescente:\n"+num1+", "+num2+", "+num3);
            }
        }
    }
}
