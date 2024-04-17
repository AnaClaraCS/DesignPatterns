package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> listaProdutos = inicializaListaProduto();

        Iterator ordenado = new OrdenaCategoriaPreco(listaProdutos);
        System.out.println("Lista de produtos:\n");
        while (ordenado.hasMore()) {
            System.out.println(ordenado.getNext());
        }
    }

    public static List<Produto> inicializaListaProduto(){
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

        Produto p7 = new Produto("TV", 1500, categoria3);
        listaProdutos.add(p7);
        Produto p8  = new Produto("Cafeteira", 200, categoria3);
        listaProdutos.add(p8);
        Produto p9 = new Produto("Batedeira", 150, categoria3);
        listaProdutos.add(p9);
        Produto p10 = new Produto("Sanduicheira", 80, categoria3);
        listaProdutos.add(p10);

        return listaProdutos;
    }
}
