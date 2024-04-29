import java.util.ArrayList;

public class ProgramaTV {

    static int cont = 1;
    protected int codigo;
    protected String nome;
    protected ArrayList <Pessoa> artistas = new ArrayList <Pessoa>();
    protected Pessoa diretor;
    protected String categoria;

    ProgramaTV(String nome, String categoria) {
        this.setCodigo();
        this.setNome(nome);
        this.setCategoria(categoria);
    }

    public void setCodigo() {
        this.codigo = ProgramaTV.cont;
        cont++;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    void setDiretor(Pessoa diretor){
        this.diretor = diretor;
    }

    void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }

    public String getCodigo() {
        return String.valueOf(this.codigo);
    }

    public String getNome(){
        return this.nome;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String getDiretor() {
        return this.diretor.getNome();
    }

    public String getArtistas(){
        String retorno = "";
        for(int i = 0; i<artistas.size(); i++){
            retorno = retorno + (artistas.get(i).getNome());
            retorno = retorno + ";";
        }
        return retorno;
    }
    public String toString() {
        return "ProgramaTV{" +
                    "codigo= " + getCodigo() +
                    ", nome='" + getNome() + '\'' +
                    ", artistas=" + getArtistas() +
                "}";
    }

}
