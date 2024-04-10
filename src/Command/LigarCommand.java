package Command;
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
