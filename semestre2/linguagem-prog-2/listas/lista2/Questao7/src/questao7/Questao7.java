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
        int expoente;
        double base;
        Calcula calc=new Calcula();
        
        base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        expoente=Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
        
        JOptionPane.showMessageDialog(null, "A potência é igual a: "+calc.potencia(base, expoente));
    }
    
}

class Calcula{
    double potencia(double base, int expoente){
        double potencia=1;
        
        for(int i=0; i<expoente; i++){
            potencia=base*potencia;
        }
        return potencia;
    }
}