package FactoryMethod;
public class FabricaGuerreiro implements FabricaPersonagens{
    // Classe que cria novos produtos Guerreiros
    public Personagem cria() {
        return new Guerreiro();
    }

}
