public class ReservasHotelFacade {

    // Facade é um padrão de design estrutural na qual uma implementação complexa (de um framework ou
    // de uma biblioteca, por exemplo) é escrito por meio de uma classe de fachada. Fornecendo uma
    // implementação mais simples para o cliente

    // Essa classe fornece métodos mais simples para o cliente reservar um quarto em um hotel, além
    // de utilizar outras fachadas para o hotel e o pagamento

    public void listaQuartosDisponiveis(){
        List<Quarto> quartos = HotelFacade.quartosDisponiveis();
        System.out.println("Listando os quartos disponíveis");
    }

    public boolean solicitarReserva(Cliente cliente, Quarto quarto){
        //implementação para reservar um quarto
        PagamentoFacade pagamento = new PagamentoFacade(cliente);
        pagamento.solicitaPagamento();

        if(pagamento.verifica()){
            HotelFacade.reservaQuarto(cliente, quarto);
            System.out.println("A reserva do quarto "+ quarto.getIdentificacao() +" para o cliente "+cliente.getNome()+" foi feita com sucesso");
            return true;
        }
        else{
            System.out.println("Erro ao resevar quarto");
            return true;
        }
        
    }

}

public class HotelFacade {

    public static List<Quarto> quartosDisponiveis(){
        List<Quarto> quartos = new ArrayList<Quarto>();
        //implementação para buscar os quartos disponíveis do hotel
        return quartos;
    }

    public static void reservaQuarto(Cliente cliente, Quarto quarto) {
        // implementação para reservar um quarto (e tirar da lista de disponíveis)
        System.out.println("Reservando quarto para cliente");
    }

}

public class PagamentoFacade {
    private Cliente cliente;

    public PagamentoFacade(Cliente cliente) {
        this.cliente = cliente;
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

public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
}

public class Quarto {
    private String identificacao;
    
    public String getIdentificacao(){
        return identificacao;
    }

}

public class FacadePrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura");
        ReservasHotelFacade reserva = new ReservasHotelFacade();
        Quarto quarto =  new Quarto();

        reserva.listaQuartosDisponiveis();

        reserva.solicitarReserva(cliente, quarto);
    }
}
