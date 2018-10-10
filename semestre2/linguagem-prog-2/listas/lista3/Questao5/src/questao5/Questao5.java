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
        Temperatura temp = new Temperatura();
        temp.tabelaCparaF();
    }
    
}

class Temperatura{
    void tabelaCparaF(){
        double[] celsius=new double[11];
        double[] fahrenheit=new double[11];
        
        String s=new String();
        for(int i=1; i<=10; i++){
            celsius[i]=celsius[i-1]+30;
            fahrenheit[i]=(celsius[i]*9/5)+32;
            s=s+celsius[i]+"---------------------"+fahrenheit[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, "Celsius---------------Fahrenheit\n0.0---------------------32.0\n"+s);
    }
}
