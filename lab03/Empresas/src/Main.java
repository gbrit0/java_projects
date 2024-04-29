import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    private static ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();

    public void main() {
        Responsavel responsavel;
        Empresa empresa;
        String op = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?");
        while (op.equals("S")){
            //public Empresa(String nome, String cnpj, Responsavel responsavel)
            String nome = JOptionPane.showInputDialog("Informe o nome da empresa");
            String cnpj = JOptionPane.showInputDialog("Informe o CNPJ da empresa");
            responsavel = new Responsavel();
            empresa = new Empresa(nome, cnpj, responsavel);
            String op2 = JOptionPane.showInputDialog("Cadastrar produto para a empresa (S/N)?");
            while (op2.equals("S")){
                empresa.setListaProdutos();
                op2 = JOptionPane.showInputDialog("Cadastrar novo produto para a empresa (S/N)?");
            }
            listaEmpresas.add(empresa);
            op = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?");
        }
        System.out.println(listaEmpresas.toString());
    }
}