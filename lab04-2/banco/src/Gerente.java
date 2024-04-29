public class Gerente extends Funcionario{
    protected double bonificacao;
    protected String tipo;

    public void setBonificacao(double bonificacao){
        this.bonificacao = bonificacao;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    Gerente(String nome, String telefone, double salario, double bonificacao, String tipo) {
        super(nome, telefone, salario);
        setBonificacao(bonificacao);
        setTipo(tipo);
    }
    
    Gerente(String nome) {
        super(nome);
        setBonificacao(bonificacao);
        setTipo(tipo);
    }

    public double getBonificacao(){
        return bonificacao;
    }
    public String getTipo(){
        return this.tipo;
    }

    @Override
    public String toString(){
        return super.toString() +
                " - Bonificação: R$ " +
                getBonificacao() +
                " - Tipo: " +
                getTipo();
    }

    @Override
    public double recebimentoAnual() {
        return super.recebimentoAnual() + (12 * getBonificacao());
    }
}
