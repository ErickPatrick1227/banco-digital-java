package main.java.com.BancoDigi;

public class contaPoupanca extends Conta {

    public contaPoupanca(Cliente cliente){
    super(cliente);
       }
    @Override
    public void imprimirExtrato() {
        System.out.println("<====Extrato Conta Poupança ====>");
        super.imprimirInfosComuns();
    }
}
