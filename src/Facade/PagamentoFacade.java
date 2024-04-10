package Facade;

public class PagamentoFacade {
    private Cliente cliente;

    public PagamentoFacade(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void solicitaPagamento() {
        // implementação para solicitar dados de pagamento do Cliente
        System.out.println("Solicitando informações para o pagamento");
    }

    public boolean verifica() {
        // implementação para verificar se o pagamento foi aprovado
        System.out.println("Verificando pagamento");
        return true;
    }

}
