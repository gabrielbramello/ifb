/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Vector;

/**
 *
 * @author yoda
 */
public class PainelCaixa extends JPanel {
    JButton botaoCadastrarCliente;
    Vector<Cliente> clientes;
    PainelCliente painelCliente;
    
    JButton botaoVisualizarCaixa;
    JLabel rotuloLucro;
    JLabel rotuloGorjeta;
    
    Caixa caixa;
    
    public PainelCaixa(Vector<Cliente> clientes, PainelCliente painelCliente, Caixa caixa) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        botaoCadastrarCliente =new JButton("Cadastrar Cliente");
        add(botaoCadastrarCliente);
        botaoCadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
        this.clientes = clientes;
        this.painelCliente = painelCliente;
        this.caixa = caixa;
        botaoVisualizarCaixa = new JButton("VisualizarCaixa");
        add(botaoVisualizarCaixa);
        rotuloLucro = new JLabel();
        add(rotuloLucro);
        rotuloGorjeta = new JLabel();
        add(rotuloGorjeta);
        botaoVisualizarCaixa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarLucro();
            }
        });
    }
    public void visualizarLucro() {
        DecimalFormat df = new DecimalFormat("R$ #.00");
        rotuloLucro.setText("Lucro do restaurante: "+df.format(caixa.lucro));
        rotuloGorjeta.setText("Gorjeta dos garçons: "+df.format(caixa.gorjeta));
    }
    public void cadastrarCliente() {
        String numeroDaMesa = JOptionPane.showInputDialog(this, "Qual o número da mesa?", "Cadastrar cliente", JOptionPane.QUESTION_MESSAGE);
        Cliente cliente = new Cliente(numeroDaMesa);
        clientes.add(cliente);
        painelCliente.preencheComboBoxCliente();
    }
}
