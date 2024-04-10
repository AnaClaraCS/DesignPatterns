package Strategy;

public class Defesa implements Estrategia {

    @Override
    public void ataque() {
        System.out.println("Ataque ao centro: 50pts");
        System.out.println("Ataque aos flancos: 50pts");
        System.out.println("Defesa: 100pts");
    }

    @Override
    public String getNome() {
        return "Defender ";
    }
}