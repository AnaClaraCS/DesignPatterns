package FactoryMethod;
public class FabricaMago implements FabricaPersonagens{
    // Classe que cria novos produtos Magos
    public Personagem cria() {
        return new Mago();
    }

}
