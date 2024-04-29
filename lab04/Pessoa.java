import java.util.ArrayList;
public class Pessoa {
    String nome;
    String nacionalidade;

    public String toString() {
        return "Pessoa{" +
                    "nome: " + getNome() +
                    ", nacionalidade: " + getNacionalidade() +
                    "}";
    }

    Pessoa (String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }
}
