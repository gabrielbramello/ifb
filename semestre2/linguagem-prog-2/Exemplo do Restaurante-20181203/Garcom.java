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
public class Garcom {
    String nome;
    double comissao;
    public Garcom(String nome) {
        this.nome = nome;
    }
    void adicionarGorjeta(double gorjeta) {
        comissao += gorjeta;
    }
    double getGorjeta() {
        return comissao;
    }
}
