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

    
            
    public static void main(String[] args) {
        double num1;
        double num2;
        OperacoesFundamentais operacao=new OperacoesFundamentais();
        
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("Selecione a operação desejada:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão"));
        
        if(opcao==1){
            JOptionPane.showMessageDialog(null, "Você escolheu soma!");
            num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            JOptionPane.showMessageDialog(null, "O resultado da soma é:\n"+num1+" + "+num2+" = "+operacao.soma(num1, num2));
        }
        else if(opcao==2){
            JOptionPane.showMessageDialog(null, "Você escolheu subtração!");
            num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            JOptionPane.showMessageDialog(null, "O resultado da subtração é:\n"+num1+" - "+num2+" = "+operacao.subtrai(num1, num2));
        }
        else if(opcao==3){
            JOptionPane.showMessageDialog(null, "Você escolheu multiplicação!");
            num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é:\n"+num1+" * "+num2+" = "+operacao.multiplica(num1, num2));
        }
        else if(opcao==4){
            JOptionPane.showMessageDialog(null, "Você escolheu divisão!");
            num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            JOptionPane.showMessageDialog(null, "O resultado da divisão é:\n"+num1+" / "+num2+" = "+operacao.divide(num1, num2));
        }
        else{
            JOptionPane.showMessageDialog(null, "Opção Invalida");
        }
    }
    
}

class OperacoesFundamentais{
    double soma(double num1, double num2){
        return num1+num2;
    }
    double subtrai(double num1, double num2){
        return num1-num2;
    }
    double multiplica(double num1,double num2){
        return num1*num2;
    }
    double divide(double num1, double num2){
        return num1/num2;
    }
}