package main.java.com.BancoDigi;

public class contaCorrente extends Conta {

    public contaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("<==== Extrato Conta Corrente ====>");
        super.imprimirInfosComuns();
    }


}
