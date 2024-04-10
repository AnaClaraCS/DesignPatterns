package FactoryMethod;
public class FabricaArqueiro implements FabricaPersonagens{
    // Classe que cria novos produtos Arqueiros
    public Personagem cria() {
        return new Arqueiro();
    }

}
