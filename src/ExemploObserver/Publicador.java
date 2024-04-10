package ExemploObserver;

import java.util.ArrayList;
import java.util.List;

public class Publicador {
    private List<Assinante> assinantes = new ArrayList<Assinante>();
    private boolean estadoPrincipal; 

    public Publicador(){
        estadoPrincipal=false;
    }

    public void logicaPrincipal(){
        estadoPrincipal=!estadoPrincipal;
        notificaAssinantes();
    }

    private void notificaAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.atualiza(estadoPrincipal);
        }
    }

    public void adicionaAssinate(Assinante assinante){
        assinantes.add(assinante);
    }

    public void removeAssinante(Assinante assinante){
        assinantes.remove(assinante);
    }
}



