package Strategy;

public class AtaqueFlancos implements Estrategia {

    @Override
    public void ataque() {
        System.out.println("Ataque ao centro: 50pts");
        System.out.println("Ataque aos flancos: 100pts");
        System.out.println("Defesa: 50pts");
    }

    @Override
    public String getNome() {
        return "Ataque pelos Flancos";
    }
}