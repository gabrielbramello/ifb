/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author yoda
 */
public class PainelCheff extends JPanel {
    JLabel rotuloNome;
    JTextField campoNome;
    JLabel rotuloPreco;
    JTextField campoPreco;
    JButton botaoCadastrar;
    public PainelCheff() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        rotuloNome = new JLabel("Nome do prato:");
        campoNome = new JTextField(30);
        rotuloPreco = new JLabel("Preço:");
        campoPreco = new JTextField(10);
        botaoCadastrar = new JButton("Cadastrar novo prato.");
        add(rotuloNome);
        add(campoNome);
        add(rotuloPreco);
        add(campoPreco);
        add(botaoCadastrar);
        
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });
    }
    
    public void cadastrar() {
        String url = "jdbc:postgresql://localhost:5432/restaurante";
        String usuario = "postgres";
        String senha = "jedy";
        String nome = campoNome.getText();
        if(nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Não pode ser cadastrado prato sem nome.", "Aviso!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double preco;
        String precoTextual = campoPreco.getText();
        precoTextual = precoTextual.replace(',', '.');
        try {
            preco = Double.parseDouble(precoTextual);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O preço deve ser númerico.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sql = "INSERT INTO produto VALUES ('"+nome+"','"+preco+"');";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
        }catch(ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar o driver do banco de dados.\nFavor contactar o administrador do sistema.");
        } catch(SQLException sqle) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao comunicar com o banco de dados.\nFavor contactar o administrador do sistema.");
        }
    }
    
}
