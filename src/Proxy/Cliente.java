package Proxy;
// 1. Não Confidencial
// 2. Confidencial
// 3. Secreto
// 4. Altamente secreto
// - Restrição: S possui permissão de leitura ou escrita sobre O se Classe(S) >= Classe(O)

public class Cliente {
    public static void main(String[] args) {
        Usuario usuarioNaoConfidencial = new UsuarioNaoConfidencial();
        Usuario usuarioSecreto = new UsuarioSecreto();
        Usuario usuarioAltamenteSecreto = new UsuarioAltamenteSecreto();

        Informacao informacaoNaoConfidencial = new InformacaoNaoConfidencial();
        Informacao informacaoConfidencial = new InformacaoConfidencial();
        Informacao informacaoAltamenteSecreto = new InformacaoAltamenteSecreta();

        ProxyInformacao proxy = new ProxyInformacao();

        proxy.setUsuario(usuarioNaoConfidencial);
        proxy.setInformacao(informacaoNaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoAltamenteSecreto);
        proxy.acesso();

        proxy.setUsuario(usuarioSecreto);
        proxy.setInformacao(informacaoNaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoAltamenteSecreto);
        proxy.acesso();

        proxy.setUsuario(usuarioAltamenteSecreto);
        proxy.setInformacao(informacaoNaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoConfidencial);
        proxy.acesso();
        proxy.setInformacao(informacaoAltamenteSecreto);
        proxy.acesso();

        proxy.imprimeLog();
    }
}
