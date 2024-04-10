package FactoryMethod;
public class PrincipalFactoryMethod {
    public static void main(String[] args) {
        FabricaPersonagens f = new FabricaArqueiro();
        Personagem arqueiro = f.cria();
        arqueiro.setNome("Katniss");
        arqueiro.equipamento();

        f = new FabricaGuerreiro();
        Personagem guerreiro = f.cria();
        guerreiro.setNome("Jhon Snow");
        guerreiro.equipamento();

        f = new FabricaMago();
        Personagem mago = f.cria();
        mago.setNome("Gandalf");
        mago.equipamento();
    }

}
