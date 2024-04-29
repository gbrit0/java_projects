public class Caixa extends Funcionario{
    protected String horario;

    Caixa(String nome, String telefone,  double salario, String horario) {
        super(nome, telefone, salario);
        setHorario(horario);
    }
    Caixa(String nome, String telefone) {
        super(nome, telefone);
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getHorario() {
        return this.horario;
    }

    @Override
    public String toString(){
        return super.toString()+
                " - Horário: " +
                getHorario();
    }

}
