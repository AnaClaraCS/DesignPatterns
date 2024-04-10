package Command;
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
