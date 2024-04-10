package FactoryMethod;
public class Guerreiro implements Personagem{

    // Classe produto
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void habilidadeBasica() {
        System.out.println("Dano de 20pts");        
    }

    public void habilidadeEspecial() {
        System.out.println("Dano de 50pts");  
    }

    public void equipamento() {
        System.out.println(nome + " usa uma espada");
    }

}

