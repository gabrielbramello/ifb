/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

/**
 *
 * @author yoda
 */
public class PainelCliente extends JPanel {
    JPanel painelSuperior;
    JLabel rotuloCliente;
    JComboBox comboBoxCliente;
    JPanel painelCentral;
    JPanel painelInferior;
    JButton botaoPedir;
    JButton botaoFecharConta;
    JButton botaoPagar;
    JScrollPane painelComRolagem;
    Vector<Cliente> clientes;
    int selecionado;
    JTextField[][] camposMenu;
    Vector<Produto> menu;
    Caixa caixa;
    
    public PainelCliente(Vector<Cliente> clientes, Caixa caixa) {
        setLayout(new BorderLayout());
        painelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        add(painelSuperior, BorderLayout.NORTH);
        painelInferior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        add(painelInferior, BorderLayout.SOUTH);
        painelCentral = new JPanel();
        painelComRolagem = new JScrollPane(painelCentral, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(painelComRolagem, BorderLayout.CENTER);
        botaoPedir = new JButton("Fazer pedido");
        painelInferior.add(botaoPedir);
        botaoFecharConta = new JButton("Fechar conta");
        painelInferior.add(botaoFecharConta);
        botaoPagar = new JButton("Efetuar pagamento");
        painelInferior.add(botaoPagar);
        
        rotuloCliente = new JLabel("Cliente: ");
        comboBoxCliente = new JComboBox();
        painelSuperior.add(rotuloCliente);
        painelSuperior.add(comboBoxCliente);
        
        preencheMenu();
        
        this.clientes = clientes;
        this.caixa = caixa;
        selecionado = -1;
        
        botaoPedir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pedir();
            }
        });
        botaoFecharConta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fecharConta();
            }
        });
        botaoPagar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                fazPagamento();
            }
        });
    }
    
    public void fazPagamento() {
        if(comboBoxCliente.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(this, "Não foi selecionado nenhum cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double pagamento = Double.parseDouble(JOptionPane.showInputDialog(this, "Quanto vai ser entregue?", "Pagamento", JOptionPane.QUESTION_MESSAGE));
        clientes.elementAt(comboBoxCliente.getSelectedIndex()).efetuarPagamento(pagamento,caixa);
        clientes.removeElementAt(comboBoxCliente.getSelectedIndex());
        preencheComboBoxCliente();
    }
    
    public void pedir() {
        if(comboBoxCliente.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(this, "Não foi selecionado nenhum cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(selecionado == -1) {
            JOptionPane.showMessageDialog(this, "Não foi selecionado nenhum prato.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Cliente cli = clientes.elementAt(comboBoxCliente.getSelectedIndex());
        cli.realizarPedido(menu.elementAt(selecionado));
    }
    
    public void fecharConta() {
        if(comboBoxCliente.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(this, "Não foi selecionado nenhum cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String conta = clientes.elementAt(comboBoxCliente.getSelectedIndex()).fecharConta();
//        JOptionPane.showMessageDialog(this, conta);
        JFrame frame = new JFrame();
        JTextArea area = new JTextArea(conta);
        JScrollPane painel = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(painel);
        frame.setSize(200, 300);
        frame.setVisible(true);
    }
    
    public void preencheMenu() {
        String url = "jdbc:postgresql://localhost:5432/restaurante";
        String usuario = "postgres";
        String senha = "jedy";
        String sql = "SELECT * FROM produto;";
        ResultSet rs = null;
        menu = new Vector<Produto>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                Produto p = new Produto(nome, preco);
                menu.add(p);
            }
        }catch(ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar o driver do banco de dados.\nFavor contactar o administrador do sistema.");
        } catch(SQLException sqle) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao comunicar com o banco de dados.\nFavor contactar o administrador do sistema.");
        }
        DecimalFormat df = new DecimalFormat("R$ #.00");
        painelCentral.setLayout(new GridLayout(menu.size()+1, 2));
        JTextField cabecalhoDescricao = new JTextField("Descrição");
        cabecalhoDescricao.setBackground(Color.lightGray);
        painelCentral.add(cabecalhoDescricao);
        JTextField cabecalhoPreco = new JTextField("Preço");
        cabecalhoPreco.setBackground(Color.lightGray);
        painelCentral.add(cabecalhoPreco);
        camposMenu = new JTextField[menu.size()][2];
        for(int i = 0; i < menu.size(); i++) {
            camposMenu[i][0] = new JTextField(menu.elementAt(i).getNome());
            camposMenu[i][1] = new JTextField(df.format(menu.elementAt(i).getPreco()));
            painelCentral.add(camposMenu[i][0]);
            painelCentral.add(camposMenu[i][1]);
            camposMenu[i][0].addMouseListener(new MouseListener(){
                public void mouseClicked(MouseEvent e) {
                    JTextField campo = (JTextField) e.getSource();
                    for(int i = 0; i < menu.size(); i++) {
                        if(campo.getText().equals(camposMenu[i][0].getText())) {
                            selecionado = i;
                            camposMenu[i][0].setBackground(new Color(125,125,255));
                            camposMenu[i][1].setBackground(new Color(125,125,255));
                        } else {
                            camposMenu[i][0].setBackground(Color.white);
                            camposMenu[i][1].setBackground(Color.white);
                        }
                    }
                }
                public void mousePressed(MouseEvent e) {
                }
                public void mouseReleased(MouseEvent e) {
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseExited(MouseEvent e) {
                }
            });
            camposMenu[i][1].addMouseListener(new MouseListener(){
                public void mouseClicked(MouseEvent e) {
                    JTextField campo = (JTextField) e.getSource();
                    for(int i = 0; i < menu.size(); i++) {
                        if(campo.getText().equals(camposMenu[i][1].getText())) {
                            selecionado = i;
                            camposMenu[i][0].setBackground(new Color(125,125,255));
                            camposMenu[i][1].setBackground(new Color(125,125,255));
                        } else {
                            camposMenu[i][0].setBackground(Color.white);
                            camposMenu[i][1].setBackground(Color.white);
                        }
                    }
                }
                public void mousePressed(MouseEvent e) {
                }
                public void mouseReleased(MouseEvent e) {
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseExited(MouseEvent e) {
                }
            });
        }
    }
    
    public void preencheComboBoxCliente() {
        comboBoxCliente.removeAllItems();
        for(int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.elementAt(i);
            comboBoxCliente.addItem(cliente.numeroDaMesa);
        }
    }
}
