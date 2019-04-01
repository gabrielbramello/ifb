
package caixa;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Gabriel e Luan
 */
public class Caixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float produtos;
        float total = 0;
        int confirm = 1;

        JLabel boasvindas = new JLabel("Seja Bem Vindo!");
        boasvindas.setHorizontalAlignment(SwingConstants.CENTER);
        boasvindas.setPreferredSize(new Dimension(300, 70));
        boasvindas.setFont(new Font("Dialog", Font.PLAIN, 24));
        JOptionPane.showMessageDialog(null, boasvindas, "Bem Vindo!", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Esse sistema foi desenvolvido por:\n\n- Gabriel Brandão de Mello\n- Luan Kol", "Bem Vindo!", JOptionPane.PLAIN_MESSAGE);
        JLabel label = new JLabel();
        label.setText("Para dar início a caixa registradora aperte ok");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(400, 70));
        label.setFont(new Font("Dialog", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label, "Caixa Registradora", JOptionPane.PLAIN_MESSAGE);

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite a quantidade de produtos\n\n", "Caixa Registradora", JOptionPane.PLAIN_MESSAGE));
        while (confirm == 1) {
            confirm = JOptionPane.showConfirmDialog(null, "Foram registrados " + quantidade + " produtos. Deseja prosseguir?");
            if (confirm == 1) {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite a quantidade de produtos\n\n", "Caixa Registradora", JOptionPane.PLAIN_MESSAGE));
            }
        }

        float[] valores = new float[quantidade];
        Menu m = new Menu();
        for (int i = 0; i < quantidade; i++) {
            int j = i + 1;
            produtos = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto (" + j + "/" + quantidade + ")", "Caixa Registradora", JOptionPane.PLAIN_MESSAGE));
            total = total + produtos;
            valores[i] = produtos;
        }
        JOptionPane.showMessageDialog(null, "Valor da Compra \nR$ " + total);
        m.metodoPagamento(total);
        System.out.println("Cupom Fiscal");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Produto" + (i + 1) + ".......................R$ " + valores[i]);
        }
        System.out.println("Obrigado e Volte Sempre!");
    }
}

class Menu {

    void metodoPagamento(float total) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o método de pagamento\n1-Dinheiro\n2-Cheque\n3-Cartão de Cŕedito"));
        Pagamento pag = new Pagamento();

        switch (menu) {
            case 1:
                pag.pagamentoDinheiro(total);
                break;
            case 2:
                pag.pagamentoCheque(total);
                break;
            case 3:
                pag.pagamentoCartao(total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida! Selecione a opção correta");
                metodoPagamento(total);
                break;
        }
    }
}

class Pagamento {

    void pagamentoDinheiro(float total) {

        JOptionPane.showMessageDialog(null, "Pagamento em Dinheiro");
        float totalDesconto = (float) (total * 0.9);
        float troco;
        int i = 0;
        JOptionPane.showMessageDialog(null, "O valor com desconto de 10% é de R$ " + totalDesconto);
        float recebido = Float.parseFloat(JOptionPane.showInputDialog(null, "O valor da compra é de R$ "+totalDesconto+"\nEntre com o valor recebido do Cliente"));

        do {
            troco = recebido - totalDesconto;
            if (troco < 0) {
                recebido = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor menor que a compra, por favor digite novamente"));
            } else {
                i = 1;
            }
        } while (i != 1);
        JOptionPane.showMessageDialog(null, "O valor recebido do cliente foi:\nR$ " + recebido);

        JOptionPane.showMessageDialog(null, "O valor do troco é de:\nR$ " + troco);
        JOptionPane.showMessageDialog(null, "Obrigado e Volte Sempre!");
    }

    void pagamentoCheque(float total) {
        JOptionPane.showMessageDialog(null, "Pagamento em Cheque");
        float totalDesconto = (float) (total * 0.95);
        int prestacao;
        do {
            prestacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Total R$"+total+"\nSelecione o número de parcelas\n1 - 1x com 5% de desconto R$ " + totalDesconto + "\n2 - 2x R$ " + total / 2 + "\n3 - 3x R$ " + total / 3));
            if (prestacao > 1 && prestacao < 4) {
                JOptionPane.showMessageDialog(null, "Resumo:\nTotal R$ " + total + "\nPagamento em Cheque em " + prestacao + " prestações de R$ " + total / prestacao);
            }
            if (prestacao == 1) {
                JOptionPane.showMessageDialog(null, "Resumo:\nTotal R$" + total + "\nPagamento em Cheque em 1 prestação de R$" + totalDesconto);
            }
            if (prestacao <= 0 || prestacao > 3) {
                JOptionPane.showMessageDialog(null, "Opção invalida, digite novamente");
            }
        } while (prestacao <= 0 || prestacao > 3);
        JOptionPane.showMessageDialog(null, "Obrigado e Volte Sempre!");
    }

    void pagamentoCartao(float total) {
        JOptionPane.showMessageDialog(null, "Pagamento em Cartão de Crédito");
        float[] parcela = new float[11];
        int prestacao;
        String s = new String();
        for (int i = 1; i <= 10; i++) {
            parcela[i] = total / i;
            s = s + ((i) + "-" + (i) + "x R$ " + parcela[i] + "\n");
        }
        do {
            prestacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Total R$ "+total+"\nSlecione o número de parcelas\n" + s));
            if (prestacao <= 0 || prestacao > 10) {
                JOptionPane.showMessageDialog(null, "Opção invalida. Digite novamente");
            } else {
                JOptionPane.showMessageDialog(null, "Resumo:\nTotal R$ " + total + "\n Pagamento com Cartão de Crédito em " + prestacao + "x de R$" + parcela[(prestacao)]);
                JOptionPane.showMessageDialog(null, "Transação Concluída!");
                JOptionPane.showMessageDialog(null, "Obrigado e Volte Sempre!");
            }
        } while (prestacao <= 0 || prestacao > 10);
    }
}
