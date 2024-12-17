package src.apresentaçao.model;
// Model - ContaNormal.java
public class ContaNormal extends Conta {
    @Override
    public void creditar(double valor) {
        saldo += valor;
    }

    @Override
    public void debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }
}
