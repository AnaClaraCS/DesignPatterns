package Facade;

//import java.util.List;

public class ReservasHotelFacade {

    // Facade é um padrão de design estrutural na qual uma implementação complexa (de um framework ou
    // de uma biblioteca, por exemplo) é escrito por meio de uma classe de fachada. Fornecendo uma
    // implementação mais simples para o cliente

    // Essa classe fornece métodos mais simples para o cliente reservar um quarto em um hotel, além
    // de utilizar outras fachadas para o hotel e o pagamento

    public void listaQuartosDisponiveis(){
        //List<Quarto> quartos = HotelFacade.quartosDisponiveis();
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
