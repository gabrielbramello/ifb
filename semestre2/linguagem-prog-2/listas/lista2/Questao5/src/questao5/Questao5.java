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
        double num1;
        double num2;
        Calculadora calc = new Calculadora();
        num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        
        JOptionPane.showMessageDialog(null, "Soma="+calc.somaDoisNum(num1, num2)+"\nDiferença="+calc.diferencaDoisNum(num1, num2)+"\nProduto="+calc.produtoDoisNum(num1, num2)+"\nRazão="+calc.razaoDoisNum(num1, num2));
    }
    
}

class Calculadora{
    
    double somaDoisNum(double a, double b){
        double soma;
        soma=a+b;
        return soma;
    }
    
    double diferencaDoisNum(double a, double b){
        double diferenca;
        diferenca=a-b;
        return diferenca;
    }
    
    double produtoDoisNum(double a, double b){
        double produto;
        produto=a*b;
        return produto;
    }
    
    double razaoDoisNum(double a, double b){
        double razao;
        razao=a/b;
        return razao;
    }
}
