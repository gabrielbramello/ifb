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
        Fibonaci fibo=new Fibonaci();
        fibo.fibonaci();
    }
    
}

class Fibonaci{
    int primeirotermo=1;
    int[] termos = new int[50];
    void fibonaci(){
        String s = new String();
        for(int i=0; i<50; i++){
            if(i==0){
                termos[i]=primeirotermo;
                s=Integer.toString(termos[i])+" ";
            }
            else if(i==1){
                termos[i]=primeirotermo;
                s+=Integer.toString(termos[i])+" ";
            }
            else{
                termos[i]=termos[i-2]+termos[i-1];
                s+=(Integer.toString(termos[i])+" ");
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
}
