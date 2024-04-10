package Proxy;

public class UsuarioNaoConfidencial implements Usuario{

    public int nivelAcesso() {
        return 1;       
    }

}
