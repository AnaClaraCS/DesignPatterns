package FactoryMethod;
public class Arqueiro implements Personagem{

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
        System.out.println("Dano de 30pts");  
    }

    public void equipamento() {
        System.out.println(nome + " usa um arco");
    }

}
