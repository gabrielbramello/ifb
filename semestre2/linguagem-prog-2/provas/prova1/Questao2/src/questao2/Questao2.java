/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaData d = new ContaData();
        int dias=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias: "));
        d.conveteDias(dias);
    }
    
}

class ContaData{
    void conveteDias(int dia){
        int mes;
        int ano;
        
        mes=dia/30;
        ano=mes/12;
        dia=dia%30;
        mes=mes%12;
        
        JOptionPane.showMessageDialog(null, ano+" anos, "+mes+" meses e "+dia+" dias");
    }
}