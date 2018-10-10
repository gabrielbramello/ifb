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
        
        Aluno a=new Aluno();
        float nota=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da lista de exercício"));
        a.setLista(nota);
        
        nota=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do seminario"));
        a.setSeminario(nota);
        
        nota=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova"));
        a.setProva(nota);
        
        
        
        if(a.mediaFinal()>=6){
            JOptionPane.showMessageDialog(null, "A média final é: "+a.mediaFinal()+"\n APROVADO");
        }
        else{
            JOptionPane.showMessageDialog(null, "Em construção");
        }
        
    }
    
}

class Aluno{
    float lista;
    float seminario;
    float prova;
    float mediafinal;
    
    void setLista(float nota){
        lista=nota;
    }
    void setSeminario(float nota){
        seminario=nota;
    }
    void setProva(float nota){
        prova=nota;
    }
    float mediaFinal(){
        mediafinal=((lista*2)+(seminario*3)+(prova*5))/10;
        return mediafinal;
    }
}
