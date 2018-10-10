/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        String numero = entrada.nextLine();
        int num1 = Integer.parseInt(numero);
        
        if(num1>10){
            System.out.println("O número digitado é maior que 10");
        }
        if(num1<10){
            System.out.println("O número digitado é menor que 10");
        }
    }
    
}
