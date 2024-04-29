import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Cadastro {
    private static final ArrayList<Cliente> clientes = new  ArrayList<>();
    public static void main(){
        Caixa caixa = new Caixa("David", "62987654321");

        caixa.setHorario("23456M");
        caixa.setTelefone("(66) 12121-2121");
        caixa.setSalario(4000.00);
        caixa.aumentoDeSalario(0.1);

        Gerente gerente = new Gerente("Cleiton");
        gerente.setTelefone("(62) 98888-5555");
        gerente.setSalario(8974.87);
        gerente.setBonificacao(1546.12);
        gerente.setTipo("PJ");
        gerente.aumentoDeSalario(0.2);
//        JOptionPane.showMessageDialog(null, caixa.toString());
//        JOptionPane.showMessageDialog(null, "Recebimento anual = R$ " +
//                String.valueOf(caixa.recebimentoAnual()));
        System.out.println(caixa + "\nRecebimento anual: R$ " +
                String.format("%.2f",caixa.recebimentoAnual()));

        Cliente cliente1 = new Cliente("Ana Cláudia",
                "(62) 55555-5555",
                26,
                "78945612336");
        clientes.add(cliente1);

        Cliente cliente2 = new Cliente("Camila",
                "(62) 78978-9789",
                24,
                "15151515151");
        clientes.add(cliente2);

        Cliente cliente3 = new Cliente("Marcos",
                "(99)87654-3210",
                45,
                "74185296374");
        clientes.add(cliente3);

        cliente1.desativaCliente();

        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }   
}
