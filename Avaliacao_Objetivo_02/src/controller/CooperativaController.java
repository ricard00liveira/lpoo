package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class CooperativaController {
    public static void main(String[] args) {
//        a. Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
//        nos atributos dessas instâncias, e imprima esses objetos;
        Cliente c1 = new Cliente("Jesus");
        System.out.println(c1);
        Cliente c2 = new Cliente("José");
        System.out.println(c2);
        Cliente c3 = new Cliente("Maria");
        System.out.println(c3);

        ContaCorrente cc1 = new ContaCorrente(2000);
        System.out.println(cc1);
        ContaCorrente cc2 = new ContaCorrente(3000);
        System.out.println(cc2);
        ContaCorrente cc3 = new ContaCorrente(4000);
        System.out.println(cc3);

        ContaPoupanca cp1 = new ContaPoupanca(4000);
        System.out.println(cp1);
        ContaPoupanca cp2 = new ContaPoupanca(3000);
        System.out.println(cp2);
        ContaPoupanca cp3 = new ContaPoupanca(2000);
        System.out.println(cp3);

//        b. Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
//        os associados, depois, imprima essa (s) coleção (ões);
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        System.out.println("Contas: \n" + contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        System.out.println("Associados: \n" + associados);
    }
}
