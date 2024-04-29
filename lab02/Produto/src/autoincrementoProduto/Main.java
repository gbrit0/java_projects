package autoincrementoProduto;

import javax.swing.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

class Main {
    public static void main() {
        Produto p1 = new Produto();
//        System.out.println(p1.getCodigoProduto());
        p1.completarCadastroProduto();

        Produto p2 = new Produto(
                JOptionPane.showInputDialog("Informe o nome do produto: "));
        System.out.println("Código: " + p2.getCodigoProduto() +
                "Nome: " + p2.getNomeProduto());

        Produto p3 = new Produto(
                JOptionPane.showInputDialog("Informe o nome do produto: "),
                parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")));
//        System.out.println("Código: " + p2.getCodigoProduto() +
//                "Nome: " + p2.getNomeProduto() +
//                "Quantidade: " + p2.getQuantidadeProduto());

        Produto p4 = new Produto(
                JOptionPane.showInputDialog("Informe o nome do produto: "),
                parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")),
                JOptionPane.showInputDialog("Informe o tipo do produto:"),
                parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:")));
//        System.out.println(p4.toString());


        double total = p1.venderProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade de " + p1.getNomeProduto() + " a ser vendida?")));
        JOptionPane.showMessageDialog(null, "Valor total de venda: R$ " + total);

        p1.comprarProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade a ser comprada?")),
                parseDouble(JOptionPane.showInputDialog("Qual o novo valor de " + p1.getNomeProduto() + "?")));

        p1.imprimeComparacao(p2);

        System.out.println(p1.toString());


        total = p2.venderProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade de " + p2.getNomeProduto() + " a ser vendida?")));
        JOptionPane.showMessageDialog(null, "Valor total de venda: R$ " + total);

        p2.comprarProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade a ser comprada?")),
                parseDouble(JOptionPane.showInputDialog("Qual o novo valor de " + p2.getNomeProduto() + "?")));

        p2.imprimeComparacao(p3);

        System.out.println(p2.toString());


        total = p3.venderProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade de " + p3.getNomeProduto() + " a ser vendida?")));
        JOptionPane.showMessageDialog(null, "Valor total de venda: R$ " + total);

        p3.comprarProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade a ser comprada?")),
                parseDouble(JOptionPane.showInputDialog("Qual o novo valor de " + p3.getNomeProduto() + "?")));

        p3.imprimeComparacao(p4);

        System.out.println(p3.toString());


        total = p4.venderProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade de " + p4.getNomeProduto() + " a ser vendida?")));
        JOptionPane.showMessageDialog(null, "Valor total de venda: R$ " + total);

        p4.comprarProduto(parseInt(JOptionPane.showInputDialog("Qual a quantidade a ser comprada?")),
                parseDouble(JOptionPane.showInputDialog("Qual o novo valor de " + p4.getNomeProduto() + "?")));

        p4.imprimeComparacao(p1);

        System.out.println(p4.toString());

        Produto p5 = new Produto();
        p5.inserir("Playstation 5", 20, "Consoles", 3499.99);
        Produto p6 = new Produto("Playstation 5", 20, "Consoles", 3499.99);
        p5.imprimeComparacao(p6);

    }


}