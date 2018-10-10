/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a idade");
        String input = entrada.nextLine();
        int idade = Integer.parseInt(input);
        
        if(idade>=0 && idade<=2){
            System.out.println("Classificação: Bebê");
        }
        if(idade>=3 && idade<=11){
            System.out.println("Classificação: Criança");
        }
        if(idade>=12 && idade<=17){
            System.out.println("Classificação: Adolescente");
        }
        if(idade>=18 && idade<=24){
            System.out.println("Classificação: Jovem");
        }
        if(idade>=25 && idade<=59){
            System.out.println("CLassificação: Adulto");
        }
        if(idade>=60 && idade<=99){
            System.out.println("Classificação: Idoso");
        }
        if(idade>=100){
            System.out.println("Classificação: Ancião");
        }
    }
    
}
