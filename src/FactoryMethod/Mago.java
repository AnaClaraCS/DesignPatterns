package FactoryMethod;
public class Mago implements Personagem{

    // Classe produto
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void habilidadeBasica() {
        System.out.println("Dano de 10pts");        
    }

    public void habilidadeEspecial() {
        System.out.println("Dano de 100pts");  
    }

    public void equipamento() {
        System.out.println(nome + " usa um cajado");
    }

}

