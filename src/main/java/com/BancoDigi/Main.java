package main.java.com.BancoDigi;

public class Main {
    public static void main(String[] args) {
        Cliente erick = new Cliente();
        erick.setNome("erick");

        Conta cc = new contaCorrente(erick);
        Conta poupanca = new contaPoupanca(erick);

        cc.depositar(1000);
        cc.transferir(1000, poupanca);
        poupanca.sacar(1010);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}