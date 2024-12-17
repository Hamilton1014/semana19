package src.apresentaçao.model;
// Model - Conta.java
public abstract class Conta {
    protected String numero;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void creditar(double valor);
    public abstract void debitar(double valor);
}
