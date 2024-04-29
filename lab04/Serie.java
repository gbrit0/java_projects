public class Serie extends ProgramaTV{
    private int qtdTemporadas;
    private int qtdEpisodios;

    public void setQtdTemporadas(int qtdTemporadas) {
        this.qtdTemporadas = qtdTemporadas;
    }

    public void setQtdEpisodios(int qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    Serie(String nome, String categoria, int qtdTemporadas, int qtdEpisodios) {
        super(nome, categoria);
        this.setQtdEpisodios(qtdEpisodios);
        this.setQtdTemporadas(qtdTemporadas);
    }
    public String getTemporadas(){
        return String.valueOf(this.qtdTemporadas);
    }

    public String getQtdEpisodios(){
        return String.valueOf(this.qtdEpisodios);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "codigo = " + getCodigo() +
                ", nome = '" + getNome() + '\'' +
                ", diretor = " + getDiretor() +
                ", categoria = '" + getCategoria() + '\'' +
                ", artistas = " + getArtistas() +
                ", qtdTemporadas = " + getTemporadas() +
                ", qtdEpisodios = " + getQtdEpisodios() +
                '}';
    }
}
