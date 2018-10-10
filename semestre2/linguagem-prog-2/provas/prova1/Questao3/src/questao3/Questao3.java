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
        Sequencia a = new Sequencia();
        a.seqPell();
    }
    
}

class Sequencia{
    void seqPell(){
        int[] pell= new int[51];
        int primeirotermo=0;
        int segundotermo=1;
        String s = new String();
        
        for(int i=1; i<=50; i++){
            if(i==1){
                pell[i]=primeirotermo;
                s=pell[i]+", ";
            }
            else if(i==2){
                pell[i]=segundotermo;
                s+=pell[i]+", ";
            }
            else{
                pell[i]=(2*pell[i-1])+(pell[i-2]);
                s+=pell[i]+", ";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
