package Strategy;

public class AtaqueCentro implements Estrategia {

    @Override
    public void ataque() {
        System.out.println("Ataque ao centro: 100pts");
        System.out.println("Ataque aos flancos: 50pts");
        System.out.println("Defesa: 50pts");
    }

    @Override
    public String getNome() {
        return "Ataque pelo Centro";
    }

}
