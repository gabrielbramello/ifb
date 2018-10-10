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
        int num;
        int soma=0;
        JOptionPane.showMessageDialog(null, "Bem vindo ao contator de números");
        
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número. Caso queira sair digite 0"));
        soma+=num;
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null, "A soma de todos os números digitados é: "+soma);
    }
    
}
