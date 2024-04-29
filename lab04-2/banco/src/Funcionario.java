public class Funcionario extends Pessoa{
    private static int auxMatricula = 0;
    protected int matricula;
    protected double salario;

    public void setMatricula(){
        auxMatricula += 1;
        this.matricula = auxMatricula;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    Funcionario(String nome, String telefone, double salario) {
        super(nome, telefone);
        setMatricula();
        setSalario(salario);
    }
    Funcionario(String nome, String telefone) {
        super(nome, telefone);
        setMatricula();
    }
    Funcionario(String nome) {
        super(nome);
        setMatricula();
    }

    public String getMatricula() {
        return String.valueOf(this.matricula);
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Matrícula: " +
                getMatricula() +
                " - Salário: R$ " +
                String.format("%.2f", getSalario());
    }
    public void aumentoDeSalario(double percentual){
        double novoSalario = salario * (1 + percentual);
        setSalario(novoSalario);
    }

    public double recebimentoAnual(){
        return 12 * getSalario();
    }

}
