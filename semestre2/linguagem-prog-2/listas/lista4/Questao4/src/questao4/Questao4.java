/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnaliseCombinatoria analise=new AnaliseCombinatoria();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int p = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        JOptionPane.showMessageDialog(null, "A combinação de "+n+", "+p+" a "+p+" é:\n"+analise.combinacao(n, p));
    }
    
}

class AnaliseCombinatoria{
    int fatorial(int num){
        int fat=1;
        for(int i=num; i>=1; i--){
            fat=fat*i;
        }
        return fat;
    }

    int combinacao(int n, int p){
        int comb;
        comb=(fatorial(n))/(fatorial(p)*(fatorial(n-p)));
        return comb;
    }
}
