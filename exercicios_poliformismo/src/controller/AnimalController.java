package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

//        Crie três instâncias de cada classe do diagrama (das possíveis) com valores válidos para
//        os seus atributos. Insira-os em uma coleção do tipo List e os imprima.
        Peixe p1 = new Peixe(1,1,1);
        Peixe p2 = new Peixe(1,2, 1);
        Peixe p3 = new Peixe(1,3, 1);

        Cachorro c1 = new Cachorro(2,1);
        Cachorro c2 = new Cachorro(2,2);
        Cachorro c3 = new Cachorro(2,3);

        Passaro a1 = new Passaro(3,1, 1);
        Passaro a2 = new Passaro(3,2, 1);
        Passaro a3 = new Passaro(3,3, 1);

        List<Animal> animais = new ArrayList<>();

        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);

        System.out.println(animais);

//        Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas
//        (2, 2), os desenhe, e imprima-os;

        animais.forEach(a -> {
            a.mover(2,2);
            a.desenhar();
        });
        System.out.println(animais);

//        Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8),
//        os desenhe e imprima-os
//        Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenada
//        (5, 5, 5), os desenhe e imprima-os

        animais.forEach(a -> {
            if (a instanceof Cachorro) {
                a.mover(8,8);
            }
            if (a instanceof Peixe){
                ((Peixe) a).mover(5,5,5);
            }
            if (a instanceof Passaro) {
                ((Passaro) a).mover(5,5,5);
            }
            a.desenhar();
        });
        System.out.println(animais);
    }
}
