/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author gabriel
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int aleatorio;
        int num;
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo Advinhe o número. Tente adivinhar o número entre 0 e 100!");
        aleatorio = r.nextInt(100);
        
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if(num>aleatorio){
                JOptionPane.showMessageDialog(null, "O número é menor. Tente novamente");
            }
            else if(num<aleatorio){
                JOptionPane.showMessageDialog(null, "O número é maior. Tente novamente");
            }
        }while(num!=aleatorio);
        JOptionPane.showMessageDialog(null, "Parabéns! O número era "+aleatorio);
    }
    
}
