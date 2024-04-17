package Iterator;

import java.util.Collections;
import java.util.List;

public class OrdenaCategoriaPreco implements Iterator{
    private List<Produto> produtos;
    private int index;

    public OrdenaCategoriaPreco(List<Produto> produtos){
        this.produtos = produtos;
        Collections.sort(produtos);
        index=0;
    }

    public Produto getNext() {
        return produtos.get(index++);
    }

    public boolean hasMore() {
        return produtos.size()>index;
    }

}
