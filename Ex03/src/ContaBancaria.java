public class ContaBancaria {
    private int numero;
    private int agencia;
    private String titular;
    private double saldo = 0;

    public ContaBancaria(int numero, int agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double value) {
        this.saldo -= value;
    }

    public void depositar(double value) {
        this.saldo += value;
    }

    public void imprimirInfosConta() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    }
}