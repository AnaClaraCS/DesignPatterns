public interface Command {

    // O design patter Command é um padrão comportamental que transforma ações em objejos independetes.
    // Ou seja, em vez de lidarmos com métodos de um objeto, lidamos com um objeto, que deve conter
    // todas as informações para a execução da ação. Permitindo que tanto o gerenciamento de ações
    // quanto a criação de um histórico.

    // O Command deve ser uma interface ou classe abstrata e deve ter o método exceute.

    public boolean execute(Dispositivo dispositivo);

    // O método undo serve para desfazer ações

    public boolean undo(Dispositivo dispositivo);

}

public class LigarCommand implements Command{

    // Essa classe implementa a interface Command, no seu execute() ela chama o metodo ligar de
    // um dispositivo ligável (implementa a interface ligavel).

    @Override
    public boolean execute(Dispositivo dispositivo) {
        if(dispositivo instanceof Ligavel){
            Ligavel l = (Ligavel)dispositivo;
            return l.ligar();
        }
        return false;
    }

    @Override
    public boolean undo(Dispositivo dispositivo) {
        if (dispositivo instanceof Ligavel) {
            Ligavel l = (Ligavel) dispositivo;
            return l.desligar();
        }
        return false;
    }
}

public class Dispositivo {
    //Essa classe pode implementar outros detalhes importantes para os dispositivos que não foram
    // importantes para esse exemplo

}

public interface Ligavel {
    //Interface importe para verificar se um dispositivo possui os métodos ligar e desligar
    public boolean ligar();
    public boolean desligar();
    public boolean isLigada();
}

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

public class CommandPrincipal {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        LigarCommand ligar = new LigarCommand();
        ligar.execute(lamp);
        ligar.undo(lamp);

        Televisao tv = new Televisao();
        ligar.execute(tv);
        ligar.undo(tv);
    }
}


