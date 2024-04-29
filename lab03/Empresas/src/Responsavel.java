import javax.swing.JOptionPane;
public class Responsavel {
    private String nome;
    private String telefone;

    public Responsavel(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public Responsavel(){
        this.nome = JOptionPane.showInputDialog("Informe o nome do responsável");
        this.telefone = JOptionPane.showInputDialog("Informe o telefone do responsável");
    }

    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String toString(){
        return "Responsável[" +
                "Nome=" + getNome() +
                ",Telefone=" + getTelefone() +
                "]";
    }

}
