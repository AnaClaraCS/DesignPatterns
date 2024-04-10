package Facade;

import java.util.ArrayList;
import java.util.List;

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
