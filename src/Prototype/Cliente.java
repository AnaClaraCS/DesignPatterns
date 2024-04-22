package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        // Criando os tipos de iminigos e configurando os valores dos atributos
        InimigoPrototype soldado = new InimigoPrototype("Soldado",10,10,100);
        InimigoPrototype lider = new InimigoPrototype("Líder",20,50,100);
        InimigoPrototype chefe = new InimigoPrototype("Chefe",50,10,200);

        // Criando uma lista de iminigo para cada fase
        List<InterfacePrototype> nivel1 = new ArrayList<>();
        List<InterfacePrototype> nivel2 = new ArrayList<>();
        List<InterfacePrototype> nivel3 = new ArrayList<>();

        // Populando a lista do nível 1
        for(int i=0;i<9;i++) nivel1.add(soldado.clone());
        nivel1.add(lider);

        // Populando a lista do nível 2
        for(int i=0;i<7;i++) nivel2.add(soldado.clone());
        for(int i=0;i<3;i++) nivel2.add(lider.clone());

        // Populando a lista do nível 3
        for(int i=0;i<6;i++) nivel3.add(soldado.clone());
        for(int i=0;i<3;i++) nivel3.add(lider.clone());
        nivel3.add(chefe.clone());

        // Imprimindo no console a lista dos inimigos de cada nível
        System.out.println("------ Nivel 1 ------");
        imprime(nivel1);
        System.out.println("------ Nivel 2 ------");
        imprime(nivel2);
        System.out.println("------ Nivel 3 ------");
        imprime(nivel3);
    }

    public static void imprime(List lista){
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
