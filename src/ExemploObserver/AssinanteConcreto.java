package ExemploObserver;

public class AssinanteConcreto implements Assinante{

    @Override
    public void atualiza(boolean estado) {
        System.out.println("Fui atualizado que o estado do Publicador é: " + estado);
    }

}



