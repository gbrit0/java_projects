import java.util.Objects;

public class Cliente extends Pessoa{

    protected String status;
    protected int idade;
    protected String cpf;

    public String getStatus(){
        return status;
    }

    public String getIdade(){
        return String.valueOf(idade);
    }

    public String getCpf(){
        return String.valueOf(cpf);
    }

    public void setStatus(String status){
        this.status = status;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    Cliente(String nome, String telefone, int idade, String cpf){
        super(nome, telefone);
        setIdade(idade);
        setCpf(cpf);
        setStatus("A");
    }

    @Override
    public String toString(){
        String estado;
        if(Objects.equals(this.status, "A")){
            estado = "ativo";
        } else {
            estado = "inativo";
        }
        return super.toString() +
                " - idade: " + getIdade() +
                " anos - CPF: " + getCpf() +
                " - Status: " + estado;
    }
    public void desativaCliente(){
        if (Objects.equals(this.status, "A")){
            setStatus("I");
        }
    }
}
