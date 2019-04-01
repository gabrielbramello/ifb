/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author yoda
 */
public class Caixa {
    public double lucro;
    public double gorjeta;
    
    public void adicionarLucro(double valor) {
        lucro += valor;
    }
    
    public void adicionarGorjeta(double valor) {
        gorjeta += valor;
    }
}
