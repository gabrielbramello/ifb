/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite alguma informação");
        String nome1 = entrada.nextLine();
        System.out.println("Digite alguma informação");
        String nome2 = entrada.nextLine();
        
        System.out.println(nome2+" "+nome1);
    }
}
