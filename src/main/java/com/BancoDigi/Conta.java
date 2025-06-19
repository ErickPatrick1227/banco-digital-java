package main.java.com.BancoDigi;

public abstract class Conta implements Iconta{

    private static int SEQUENCIA = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected double saldo;
    protected int numeroConta;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIA++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("AVISO!! Valor de depósito inválido." );
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.printf("AVISO!! Valor de saque inválido ou saldo insuficiente. O saque de R$ %.2f e maior que seu saldo atual no valor de R$ %.2f\n", valor, saldo);
        }
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("AVISO!! Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número da Conta: %d", numeroConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}

