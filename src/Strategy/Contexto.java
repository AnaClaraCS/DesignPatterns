package Strategy;

public class Contexto {
    private Estrategia estrategia;

    public void ataque(){
        estrategia.ataque();
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia=estrategia;
        System.out.println("Estrategia escolhida: "+ estrategia.getNome());
    }
}
