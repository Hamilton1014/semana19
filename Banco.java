package src.apresentaçao.model;
// Model - Banco.java
public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumero() + " | Saldo: " + conta.getSaldo());
        }
    }
}
