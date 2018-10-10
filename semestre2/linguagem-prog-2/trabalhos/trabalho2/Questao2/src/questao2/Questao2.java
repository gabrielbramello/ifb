/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author gabriel
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz a=new Matriz();
        a.geraMatrizAleat();
        a.criaMatrizTransposta();
        a.mostraMatriz();
        a.mostraMatrizTransposta();
    }
    
}

class Matriz{
    int linha;
    int coluna;
    int[][] matriz;
    int[][] matrizTransposta;
    
    void geraMatrizAleat(){
        int randomLinha = (int)Math.round(Math.random()*10);
        int randomColuna = (int)Math.round(Math.random()*10);
        linha=randomLinha;
        coluna=randomColuna;
        matriz=new int[linha][coluna];
        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                int randomNumber = (int)Math.round(Math.random()*10);
                matriz[i][j]=randomNumber;
            }
        }
    }
    void mostraMatriz(){
        String s = new String();
        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                s+=matriz[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    void criaMatrizTransposta(){
        matrizTransposta=new int [coluna][linha];
        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                matrizTransposta[j][i]=matriz[i][j];
            }
        }
    }
    void mostraMatrizTransposta(){
        String s = new String();
        for(int i=0; i<coluna; i++){
            for(int j=0; j<linha; j++){
                s+=matrizTransposta[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}