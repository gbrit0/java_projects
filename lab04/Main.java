import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList <ProgramaTV>();

        ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
        p.diretor = new Pessoa("Diretor 1", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixão","Novela");
        p.diretor = new Pessoa("Diretor 2", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Marley e eu","Filme");
        p.diretor = new Pessoa("Diretor 3", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Show Ivete Sangalo","Show");
        p.diretor = new Pessoa("Diretor 4", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        Serie s;
        s = new Serie("The Walking Dead", "suspense", 12, 168);
        s.diretor = new Pessoa("Josh Hamilton", "inglesa");
        s.setArtistas(new Pessoa("Norman Reedus", "irlandesa"));
        s.setArtistas(new Pessoa("Melissa McBride", "estadunidense"));
        s.setArtistas(new Pessoa("Lauren Cohan", "estadunidense"));
        programas.add(s);

        s = new Serie("Braking Bad", "drama", 5, 62);
        s.setDiretor(new Pessoa("Vince Gilligan", "estradunidense"));
        s.setArtistas(new Pessoa("Bryan Cranston", "inglesa"));
        s.setArtistas(new Pessoa("Aaron Paul", "estadunidense"));
        s.setArtistas(new Pessoa("Anna Gunn", "estadunidense"));
        programas.add(s);

        s = new Serie("Yellowstone", "drama/faroeste", 5, 78);
        s.setDiretor(new Pessoa("Taylor Sheridan", "australiana"));
        s.setArtistas(new Pessoa("Kevin Costner", "estadunidense"));
        s.setArtistas(new Pessoa("Luke Grimes", "estadunidense"));
        programas.add(s);


        for (ProgramaTV programa : programas) {
            System.out.println(programa);
        }

    }

}
