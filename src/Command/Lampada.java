package Command;
public class Lampada extends Dispositivo implements Ligavel{
    private boolean ligada;

    public Lampada(){
        ligada=false;
    }

    public boolean isLigada(){
        return ligada;
    }

    public boolean ligar(){
        //implementação para ligar uma lampada
        ligada=true;
        System.out.println("Lâmpada ligada");
        return true;
    }

    public boolean desligar(){
        //implementação para desligar uma lampada
        ligada=false;
        System.out.println("Lâmpada desligada");
        return true;
    }
}
