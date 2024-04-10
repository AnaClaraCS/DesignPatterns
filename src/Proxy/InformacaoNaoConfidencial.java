package Proxy;
public class InformacaoNaoConfidencial implements Informacao{
    public int nivelAcesso() {
        return 1;       
    }

    public String acesso() {
        return "Informação nao confidencial";
    }
}
