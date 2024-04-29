import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Main {
    public static class Curso {
        String nome;
        String coordenador; // ou coordenadora
        String unidade; // a qual unidade se vincula ex.: INF, EMC...
        int vagas;  // quantidade de vagas ofertados por ano

        public void lerCursos(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o nome do Curso:");
            nome = sc.nextLine();
            System.out.println(STR."Quem é o coordenador do curso \{nome} ?");
            coordenador = sc.nextLine();
            System.out.println(STR."A qual unidade o curso \{nome} pertence?");
            unidade = sc.nextLine();
            System.out.println(STR."Qual a quantidade anual de vagas para o curso \{nome} ?");
            vagas = Integer.parseInt(sc.nextLine());
        }

        public void mostrarCursos(){
            System.out.println(STR."Curso: \{nome}.");
            System.out.println(STR."\{coordenador} é o coordenador(a) do curso \{nome}.");
            System.out.println(STR."O curso \{nome} pertence à unidade \{unidade}.");
            System.out.println(STR."O curso \{nome} recebe \{Integer.toString(vagas)} alunos por ano.");
        }
    }

    public static class ExercLab1_2 {
        public void main() {
            Curso c1 = new Curso();
            c1.lerCursos();

            Curso c2 = new Curso();
            c2.lerCursos();

            Curso c3 = new Curso();
            c3.lerCursos();

            Curso c4 = new Curso();
            c4.lerCursos();
        }
    }

    public static  class ExercLab1_3 {
        public void main () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informa a quantidade de cursos que deseja cadastrar:");
            int n = Integer.parseInt(sc.nextLine());
            Curso[] vetCursos = new Curso[n];

            //  Recebimento dos dados dos cursos e armazenando no vetor
            for (int i = 0; i < 1; i++) {
                vetCursos[i] = new Curso();
                vetCursos[i].lerCursos();
            }

            // Mostrar os dados dos cursos inseridos no vetor
            for (int i = 0; i < 1; i++) {
                vetCursos[i].mostrarCursos();
            }
        }
    }

    public void main(String[] args) {

        ExercLab1_2 exercLab1_2 = new ExercLab1_2();
        exercLab1_2.main();

        ExercLab1_3 exercLab1_3 = new ExercLab1_3();
        exercLab1_3.main();
    }
}