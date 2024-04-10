package Command;
public class Televisao extends Dispositivo implements Ligavel{
    private boolean ligada;

    public Televisao(){
        ligada=false;
    }

    public boolean isLigada(){
        return ligada;
    }

    public boolean ligar(){
        //implementação para ligar uma televisão
        System.out.println("Televisão ligada");
        ligada=true;
        return true;
    }

    public boolean desligar(){
        //implementação para desligar uma televisão
        ligada=false;
        System.out.println("Televisão desligada");
        return true;
    }

}
