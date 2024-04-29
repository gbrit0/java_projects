import javax.swing.JOptionPane;
public class Produto {
    private String nome;
    private double volume = 0;
    private String tipo;
    private String cor;
    private  String especificacao;

    public Produto(String nome, double volume, String tipo, String cor, String especificacao){
        this.nome = nome;
        this.volume = volume;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    public String getNome(){
        return this.nome;
    }
    public double getVolume(){
        return this.volume;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getCor(){
        return this.cor;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    public String toString(){
        return "Produto[" +
                "Nome=" + getNome() +
                ",Volume=" + getVolume() + "cm^3" +
                ",Tipo=" + getTipo() +
                ",Cor=" + getCor() +
                ",Especificação=" + getEspecificacao() +
                "]";
    }


}
