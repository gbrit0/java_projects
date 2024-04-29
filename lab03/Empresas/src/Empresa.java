import java.util.ArrayList;
import javax.swing.JOptionPane;
import static java.lang.Double.parseDouble;

public class Empresa {
    private String nome;
    private String cnpj;
    private Responsavel responsavel;
    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public Empresa(String nome, String cnpj, Responsavel responsavel){
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    public String getTelefoneResponsavel(){
        return responsavel.getTelefone();
    }
    public ArrayList<Produto> getListaProdutos() {
        return this.listaProdutos;
    }

    public String toString() {
        return "Empresa[" +
                "Nome=" + getNome() +
                ",CNPJ=" + getCnpj() +
                ",Contato do Responsável=" + getTelefoneResponsavel() +
                ",Lista de Produtos=" + getListaProdutos() +
                "]";
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    public void setListaProdutos() {
        String nome = JOptionPane.showInputDialog("Informe o nome do produto a ser cadastrado");
        double volume = parseDouble(JOptionPane.showInputDialog("Informe o volume do produto (cm^3):"));
        String tipo = JOptionPane.showInputDialog("Informe o tipo do produto:");
        String cor = JOptionPane.showInputDialog("Informe a cor do produto:");
        String especificacao = JOptionPane.showInputDialog("Qual a especificação do produto?");
        Produto prod =  new Produto(nome, volume, tipo, cor, especificacao);
        listaProdutos.add(prod);
    }
}
