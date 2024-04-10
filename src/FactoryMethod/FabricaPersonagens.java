package FactoryMethod;
public interface FabricaPersonagens {

    // O Factory Method suluciona o problema de quando precisamos trabalhar com objetos de duas ou
    // mais classes e não sabemos qual será a classe do objeto. Para isso, esse padrão de design
    // cria duas interfaces, Fabrica e Produto. A primeira é usada para a criar uma fabrica para
    // cada tipo de produto, e instancia o produto de uma classe produto. A segunda interface é algo
    // que todos os produtos precisam ter em comum.

    public Personagem cria();
}
