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
        ParOuImpar parouimpar = new ParOuImpar();
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        parouimpar.verifica(num);
    }
    
}

class ParOuImpar{
    void verifica(int num){
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "O número é par");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número é impar");
        }
    }
}