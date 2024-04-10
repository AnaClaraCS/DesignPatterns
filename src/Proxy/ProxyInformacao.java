package Proxy;

public class ProxyInformacao implements Informacao{
    private Informacao informacao;
    private Usuario usuario;
    private String log;

    public ProxyInformacao(){
        log="";
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setInformacao(Informacao informacao) {
        this.informacao = informacao;
    }

    public String acesso() {
        if(usuario.nivelAcesso() >= informacao.nivelAcesso()){
            log += "Usuário de nivel "+usuario.nivelAcesso()+" teve acesso a informação de nível "+informacao.nivelAcesso()+"\n";
            return informacao.acesso();
        }
        else
        log += "Usuário de nivel "+usuario.nivelAcesso()+" NÃO teve acesso a informação de nível "+informacao.nivelAcesso()+"\n";
            return "Acesso a informação negado ao usuário";
    }

    public void imprimeLog(){
        System.out.println(log);
    }

    public int nivelAcesso() {
        return usuario.nivelAcesso();       
    }

}
