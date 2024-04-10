package ExemploObserver;

public class Cliente {
    public static void main(String[] args) {
        Publicador publicador = new Publicador();
        Assinante a1 = new AssinanteConcreto();
        publicador.adicionaAssinate(a1);
        Assinante a2 = new AssinanteConcreto();
        publicador.adicionaAssinate(a2);

        publicador.logicaPrincipal();

        Assinante a3 = new AssinanteConcreto();
        publicador.adicionaAssinate(a3);

        publicador.logicaPrincipal();
    }
}



