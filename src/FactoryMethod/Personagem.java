package FactoryMethod;
public interface Personagem {

    //interface em comum em todas as classes de personagem 
    public void setNome(String nome);
    public String getNome();
    public void habilidadeBasica();
    public void habilidadeEspecial();
    public void equipamento();
}
