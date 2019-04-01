/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

/**
 *
 * @author yoda
 */
public class Restaurante extends JFrame {
    JTabbedPane painelComAbas;
    PainelCliente painelCliente;
    PainelCheff painelCheff;
    PainelCaixa painelCaixa;
    Caixa caixa;
    
    Vector<Cliente> clientes;
    
    public Restaurante() {
        super("BarRanco");
        clientes = new Vector<Cliente>();
        caixa = new Caixa();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        painelComAbas = new JTabbedPane();
        add(painelComAbas);
        painelCliente = new PainelCliente(clientes, caixa);
        painelComAbas.add(painelCliente, "Cliente");
        painelCheff = new PainelCheff();
        painelComAbas.add(painelCheff, "Cheff");
        painelCaixa = new PainelCaixa(clientes, painelCliente, caixa);
        painelComAbas.add(painelCaixa, "Caixa");
    }
    
    public static void main(String[] args) {
        Restaurante janela = new Restaurante();
        janela.setSize(800, 600);
        janela.setVisible(true);
    }
}
