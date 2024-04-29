public class Pessoa {
    protected String nome;
    protected String telefone;


    public String getNome() {
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    Pessoa(String nome, String telefone) {
        setNome(nome);
        setTelefone(telefone);
    }
    Pessoa(String nome) {
        setNome(nome);
    }

    public String toString(){
        return getNome() +
                " - Tel: " + getTelefone();
    }

}
