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
        int seg=Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos"));
        Tempo temp=new Tempo();
        temp.transformSeg(seg);
    }
    
}

class Tempo{
    void transformSeg(int seg){
        int min;
        int horas;
        
        min=seg/60;
        seg=seg%60;
        horas=min/60;
        min=min%60;
        if(horas==1){
            if(horas==1 && min==1 && seg!=1)
                JOptionPane.showMessageDialog(null, horas+" hora, "+min+" minuto e "+seg+" e segundos");
            else if(horas==1 && min==1 && seg==1)
                JOptionPane.showMessageDialog(null, horas+" hora, "+min+" minuto e "+seg+" e segundo");
            else
                JOptionPane.showMessageDialog(null, horas+" hora, "+min+" minutos e "+seg+" e segundos");
        }
        else if(min==1){
            if(min==1 && seg==1)
                JOptionPane.showMessageDialog(null, horas+" horas, "+min+" minuto e "+seg+"  segundo");
            else
                JOptionPane.showMessageDialog(null, horas+" horas, "+min+" minuto e "+seg+" e segundos"); 
        }
        else if(seg==1)
            JOptionPane.showMessageDialog(null, horas+" horas, "+min+" minutos e "+seg+" segundo");
        
    }
}