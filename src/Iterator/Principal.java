package Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();
        String categoria1 = "Brinquedo";
        String categoria2 = "Decoracao";
        String categoria3 = "Eletrodomestico";

        Produto p1 = new Produto("Boneco Avengers", 90, categoria1);
        listaProdutos.add(p1);
        Produto p2 = new Produto("Boneca Barbie", 90, categoria1);
        listaProdutos.add(p2);
        Produto p3 = new Produto("Boneca LadyBug", 50, categoria1);
        listaProdutos.add(p3);

        Produto p4 = new Produto("Luminaria", 150, categoria2);
        listaProdutos.add(p4);
        Produto p5  = new Produto("Kit almofadas", 90, categoria2);
        listaProdutos.add(p5);
        Produto p6 = new Produto("Kit quadros", 40, categoria2);
        listaProdutos.add(p6);

        Produto p7 = new Produto("Luminaria", 150, categoria3);
        listaProdutos.add(p7);
        Produto p8  = new Produto("Kit almofadas", 90, categoria3);
        listaProdutos.add(p8);
        Produto p9 = new Produto("Kit quadros", 40, categoria3);
        listaProdutos.add(p9);
        Produto p10 = new Produto("Kit quadros", 40, categoria3);
        listaProdutos.add(p10);


    }
}
