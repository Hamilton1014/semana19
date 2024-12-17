package src.apresentaçao;
// Main - Aplicação Principal
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        ContasBuilder contasXMLBuilder = new ContasXMLBuilder();
        BancoController controller = new BancoController(banco, contasXMLBuilder);

        controller.criarConta("1234", 1000.0);
        controller.criarConta("5678", 2000.0);
        controller.listarContas();
        controller.gerarRelatorio();  // Gera o relatório em XML
    }
}