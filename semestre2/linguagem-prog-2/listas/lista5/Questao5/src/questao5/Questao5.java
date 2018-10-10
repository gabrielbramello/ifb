/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] num = new float[10];
        String s = new String();
        for(int i=0; i<10; i++){
            num[i]=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número"));
        }
        for(int i=9; i>=0; i--){
            s+=num[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, "A ordem inversa da que foi digitada é:\n"+s);
    }
    
}
