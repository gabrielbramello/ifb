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
        int arranj;
        int n=Integer.parseInt(JOptionPane.showInputDialog("Digite n:"));
        int p=Integer.parseInt(JOptionPane.showInputDialog("Digite p:"));
        Arranjo a=new Arranjo();
        arranj=a.fatorial(n)/a.fatorial(n-p);
        JOptionPane.showMessageDialog(null, "O arranjo é:\n"+arranj);
    }
    
}

class Arranjo{
    int fatorial(int num){
        int fat=1;
        for(int i=num; i>=1; i--){
            fat=fat*i;
        }
        return fat;
    }
}