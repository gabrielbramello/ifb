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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz a=new Matriz();
        Matriz b=new Matriz();
        int randomLinha = (int)Math.round(Math.random()*10);
        int randomColuna = (int)Math.round(Math.random()*10);
        a.geraMatrizAleat(randomLinha, randomColuna);
        b.geraMatrizAleat(randomLinha, randomColuna);
        a.mostraMatriz();
        b.mostraMatriz();
        String s = new String();
        
        int[][]matrizA=a.getMatriz();
        int[][]matrizB=b.getMatriz();
        int[][]matrizSoma=new int[randomLinha][randomColuna];
        
        for(int i=0; i<a.getLinha(); i++){
            for(int j=0; j<a.getColuna();j++){
                matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        for(int i=0; i<randomLinha; i++){
            for(int j=0; j<randomColuna; j++){
                s+=matrizSoma[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
}
class Matriz{
    int linha;
    int coluna;
    int[][] matriz;
    int[][] matrizTransposta;
    
    void geraMatrizAleat(int linha, int coluna){
        this.linha=linha;
        this.coluna=coluna;
        matriz=new int[this.linha][this.coluna];
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
    
    int[][] getMatriz(){
        return matriz;
    }
    int getLinha(){
        return linha;
    }
    int getColuna(){
        return coluna;
    }
}