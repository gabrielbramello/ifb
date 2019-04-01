/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class Cliente {
    String numeroDaMesa;
    Vector<Produto> listaDePedidos;
    double total;
    public Cliente(String numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
        listaDePedidos = new Vector<Produto>();
    }
    public void realizarPedido(Produto produto) {
        listaDePedidos.add(produto);
    }
    public String fecharConta() {
        DecimalFormat df = new DecimalFormat("R$ #.00");
        String conta = "Conta da mesa "+numeroDaMesa+"\n\n";
        conta += "Produto\tPreço\n";
        for(int i = 0; i < listaDePedidos.size(); i++) {
            conta +=listaDePedidos.elementAt(i).getNome()+ "\t"+df.format(listaDePedidos.elementAt(i).getPreco())+"\n";
            total += listaDePedidos.elementAt(i).getPreco();
        }
        conta +="\nsubtotal:\t"+df.format(total)+"\n";
        conta +="gorjeta:\t"+df.format(total*0.1)+"\n";
        conta +="\nTOTAL:\t"+df.format(total*1.1)+"\n";
        return conta;
    }
    public void efetuarPagamento(double valor, Caixa caixa){
        double gorjeta = valor-total;
        caixa.adicionarLucro(total);
        caixa.adicionarGorjeta(gorjeta);
    }
}
