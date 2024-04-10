package Strategy;

import java.util.Scanner;

public class Cliente {
    public static Estrategia[] estrategias={ new AtaqueCentro(), new AtaqueFlancos(), new Defesa() };

    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        for(int i=0;i<5;i++){
            menu(contexto);
            contexto.ataque();
        }
        

    }

    public static void menu(Contexto contexto){
        for(int i=0;i< estrategias.length;i++){
            System.out.println(i+1+" - "+ estrategias[i].getNome());
        }
        System.out.println("Escolha uma estrategia de ataque:");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        contexto.setEstrategia(estrategias[op-1]);
        sc.close();

    }

}
