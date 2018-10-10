/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        String numero = entrada.nextLine();
        int num1 = Integer.parseInt(numero);
        
        System.out.println("Digite o segundo número");
        numero = entrada.nextLine();
        int num2 = Integer.parseInt(numero);
        
        int diferenca;
        
        if(num1>num2){
           diferenca=num1-num2;
           
           if(diferenca>10){
               System.out.println("A diferença entre os número é maior que 10");
           }
           else{
               System.out.println("A diferença entre os número é menor que 10");
           }
        }
        else{
            diferenca=num2-num1;
            if(diferenca>10){
               System.out.println("A diferença entre os número é maior que 10");
            }
            else{
               System.out.println("A diferença entre os número é menor que 10");
            }
        }
    }
    
}
