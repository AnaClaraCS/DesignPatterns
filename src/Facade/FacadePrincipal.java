package Facade;

public class FacadePrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura");
        ReservasHotelFacade reserva = new ReservasHotelFacade();
        Quarto quarto =  new Quarto();

        reserva.listaQuartosDisponiveis();

        reserva.solicitarReserva(cliente, quarto);
    }
}
