/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica mat=new Matematica();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "O fatorial é:\n"+num+"! = "+mat.fatorial(num));
    }
    
}
class Matematica{
    int fatorial(int num){
        int fat=1;
        for(int i=num; i>=1; i--){
            fat=fat*i;
        }
        return fat;
    }
}