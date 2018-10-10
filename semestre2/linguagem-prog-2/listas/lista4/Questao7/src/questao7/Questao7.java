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
        Numero a=new Numero();
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        a.numeroPrimo(num);
    }
    
}

class Numero{
    void numeroPrimo(int num){
        boolean primo=true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                primo=false;
            }
        }
        if(primo==false){
            JOptionPane.showMessageDialog(null, "O número não é primo");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número é primo");
        }
        
    }
}
