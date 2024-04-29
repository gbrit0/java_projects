package autoincrementoProduto;

import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Produto {
    private static int codigo = 0;
    private int codProduto;
    private String nomeProduto;
    private int qtdProduto;
    private String tipoProduto;
    private double valorProduto;

    Produto() {
        setCodProduto(Produto.codigo);
    }
    Produto(String nomeProduto) {
        setCodProduto(Produto.codigo);
        setNomeProduto(nomeProduto);
    }

    Produto(String nomeProduto, int qtdProduto) {
        setCodProduto(Produto.codigo);
        setNomeProduto(nomeProduto);
        setQtdProduto(qtdProduto);
    }

    Produto(String nomeProduto, int qtdProduto, String tipoProduto, double valorProduto) {
        setCodProduto(Produto.codigo);
        setNomeProduto(nomeProduto);
        setQtdProduto(qtdProduto);
        setTipoProduto(tipoProduto);
        setValorProduto(valorProduto);
    }
    public double venderProduto(int qtdASerVendida){
        if (this.qtdProduto>=0 && this.qtdProduto>=qtdASerVendida) {
            this.qtdProduto -= qtdASerVendida;
            return this.valorProduto * qtdASerVendida;
        } else {
            System.out.println("Estoque insuficiente!");
            return 0;
        }
    }

    public void comprarProduto(int qtd, double valorNovo){
        this.qtdProduto += qtd;
        this.valorProduto = valorNovo;
    }

    public void comprarProduto(int qtd){
        this.qtdProduto += qtd;
    }

    public String toString(){
        return "Código do Produto: " + getCodigoProduto() + "\n" +
                     "Produto: " + getNomeProduto() + "\n" +
                     "Quantidade Disponível: " + getQuantidadeProduto() + "\n" +
                     "Tipo de Produto: " + getTipoProduto() + "\n" +
                     "Valor do Produto: " + getValorProduto();
    }

    public void inserir(String nomeProduto, int qtdProduto, String tipoProduto, double valorProduto){
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
    }

    public boolean igual(Produto prod){
        return this.toString().equals(prod.toString());
    }

    public String getCodigoProduto(){
        return String.valueOf(this.codProduto);
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public String getTipoProduto(){
        return this.tipoProduto;
    }

    public String getQuantidadeProduto(){
        return String.valueOf(this.qtdProduto);
    };

    public String getValorProduto(){
        return String.valueOf(this.valorProduto);
    };

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
        Produto.codigo++;
    };

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    };

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    };

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    };

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    };

    public void completarCadastroProduto(){
        if (this.nomeProduto == null){
            setNomeProduto(JOptionPane.showInputDialog("Informe o nome do produto: "));
        };
        if (this.qtdProduto == 0){
            setQtdProduto(parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")));
        }
        if (this.tipoProduto == null){
            setTipoProduto(JOptionPane.showInputDialog("Informe o tipo do produto:"));
        }
        if (this.valorProduto == 0){
            setValorProduto(parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:")));
        }
    }
    public void imprimeComparacao(Produto p2){
        String out;
        if (this.igual(p2)) {
            out = this.getNomeProduto() + " é igual a " + p2.getNomeProduto() + ".";
        } else {
            out = this.getNomeProduto() + " é diferente de " + p2.getNomeProduto() + ".";
        }
        JOptionPane.showMessageDialog(null,out);
    }

}
