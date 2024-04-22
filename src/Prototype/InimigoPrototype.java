package Prototype;

public class InimigoPrototype implements InterfacePrototype{
    private int dano;
    private int velociade;
    private int vida;
    private String nome;

    public InimigoPrototype(String nome,int dano, int velocidade, int vida){
        this.nome=nome;
        this.dano=dano;
        this.velociade=velocidade;
        this.vida=vida;
    }

    public InimigoPrototype(InimigoPrototype prototype){
        this.nome=prototype.nome;
        this.dano=prototype.dano;
        this.velociade=prototype.velociade;
        this.vida=prototype.vida;
    }

    public InterfacePrototype clone(){
        return new InimigoPrototype(this);
    }

    public String toString(){
        return nome+" - vida: "+vida+" - dano: "+dano+" - velocidade: "+velociade;
    }

}
