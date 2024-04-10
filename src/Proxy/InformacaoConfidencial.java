package Proxy;
public class InformacaoConfidencial implements Informacao{
    public int nivelAcesso() {
        return 2;       
    }

    public String acesso() {
        return "Informação confidencial";
    }

}
