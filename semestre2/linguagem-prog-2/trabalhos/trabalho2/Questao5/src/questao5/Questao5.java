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
        Matriz a=new Matriz();
        a.geraMatrizQuadrada();
        a.mostraMatriz();
        a.determinanteMatriz();
    }
    
}

class Matriz{
    int linha;
    int coluna;
    int ordem;
    int determinante;
    int[][] matriz; 
    
    void geraMatrizQuadrada(){
        int random = (int)Math.round(Math.random()*10);
        ordem=3;
        linha=ordem;
        coluna=ordem;
        matriz=new int[linha][coluna];
        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                int randomNumber = (int)Math.round(Math.random()*10);
                matriz[i][j]=randomNumber;
            }
        }
    }
    
    void determinanteMatriz(){
        int cofator;
        int matrizaux;
        if(ordem==1){
            determinante=matriz[0][0];
        }
        if(ordem==2){
            determinante=(matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]);
        }
        if(ordem==3){
            determinante=(matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[0][2]*matriz[1][0]*matriz[2][1])-(matriz[0][0]*matriz[1][2]*matriz[2][1])-(matriz[0][1]*matriz[1][0]*matriz[2][2])-(matriz[0][2]*matriz[1][1]*matriz[2][0]);;
        }
        if(ordem>3){
            
            for(int linhabase=0; linhabase<coluna; linhabase++){
                if(matriz[0][linhabase]!=0){
                    for(int i=1; i<linha; i++){
                        for(int j=1; j<coluna; i++){
                            if(j!=linhabase){
                                
                            }
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Determinate da matriz = "+determinante);
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
}