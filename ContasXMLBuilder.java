package src.apresentaçao.View;
// View - ContasXMLBuilder.java
public class ContasXMLBuilder implements ContasBuilder {
    @Override
    public String gerarCabecalho() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
    }

    @Override
    public String gerarListagemContas(Iterator<Conta> iterator) {
        StringBuilder corpo = new StringBuilder("<contas>\n");
        while (iterator.hasNext()) {
            Conta c = iterator.next();
            corpo.append("\t<conta>\n")
                 .append("\t\t<numero>").append(c.getNumero()).append("</numero>\n")
                 .append("\t\t<saldo>").append(c.getSaldo()).append("</saldo>\n")
                 .append("\t</conta>\n");
        }
        corpo.append("</contas>\n");
        return corpo.toString();
    }

    @Override
    public String gerarSumario() {
        return "<saldo_total>Total: 10000.0</saldo_total>";
    }

    @Override
    public String listagemContas(Iterator<Conta> iterator) {
        return gerarCabecalho() + gerarListagemContas(iterator) + gerarSumario();
    }
}
