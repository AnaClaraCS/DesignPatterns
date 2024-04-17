package Iterator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    private String categoria;
    
    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getCategoria() {
        return categoria;
    }

    public String toString(){
        return nome + " - " + preco + " - " + categoria;
    }

    public int compareTo(Produto p) {
        if(this.categoria.equals(p.categoria)){
            return Double.compare(this.preco, p.preco);
        }
        else{
            return this.categoria.compareTo(p.categoria);
        }
        
    }

}
