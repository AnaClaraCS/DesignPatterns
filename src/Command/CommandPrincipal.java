package Command;
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
