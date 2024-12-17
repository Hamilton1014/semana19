package src.apresentaçao.controller;
// Controller - BancoController.java
public class BancoController {
    private Banco banco;
    private ContasBuilder contasBuilder;

    public BancoController(Banco banco, ContasBuilder contasBuilder) {
        this.banco = banco;
        this.contasBuilder = contasBuilder;
    }

    public void criarConta(String numero, double saldo) {
        Conta conta = new ContaNormal();
        conta.setNumero(numero);
        conta.setSaldo(saldo);
        banco.adicionarConta(conta);
    }

    public void listarContas() {
        banco.listarContas();
    }

    public void gerarRelatorio() {
        Iterator<Conta> iterator = banco.getContas().iterator();
        String relatorio = contasBuilder.listagemContas(iterator);
        System.out.println(relatorio);
    }
}