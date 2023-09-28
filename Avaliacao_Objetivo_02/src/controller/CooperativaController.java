package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

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


        //        c.  Movimente, pelo menos, uma conta poupança, realizando as seguintes operações:
        //    depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;
        cp1.deposita(1000);
        cp1.atualiza(0.05);
        cp1.saca(50);
        System.out.println("\nMovimentações ContaPoupança: \nResultado: " + cp1);

        //        d. Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //        R$ 500,00; saque de R$ 400,00;
        cc1.deposita(500);
        cc1.saca(400);
        System.out.println("\nMovimentações ContaCorrente: \nResultado: " + cc1);

        //        e. Faça com que cada associado tenha as seguintes quantidade de cotas, nessa ordem: 100,
        //        400, 600, 300, 600, 600, e imprima a (s) coleção (ões);
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        c1.setQdeCotas(300);
        c2.setQdeCotas(600);
        c3.setQdeCotas(600);

//        f. A partir da (s) coleção (ões), imprima todos os associados, ordenados pelo critério de
//        número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os
//        associados com o maior número de cotas no sistema.
        System.out.println(associados);
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("\nOrdenado decrescente qdeCotas: \n" + associados);

//        g. A partir da (s) coleção (ões), imprima todas as contas cadastradas no sistema, ordenadas
//        pelo critério saldo, em ordem decrescente. E, imprima todas associados que sejam
//        Associado e possua conta cadastradas no sistema, em qualquer ordem. Também faça o
//        programa imprimir a lista de contas com maior saldo bancário.
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nOrdenado decrescente Saldo: \n" + contas);

        System.out.println("\nAssociados com Conta:");
        associados.forEach(a -> {
            if(a instanceof ContaCorrente) {
                System.out.println(a);
            }
        });

        System.out.println("\nConta Associado com maior saldo: ");
        List<Conta> associadosaldo = new ArrayList<>();
        contas.forEach(c-> {
            if(c instanceof Associado) {
                associadosaldo.add(c);
            }
        });
        associadosaldo.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(associadosaldo);
    }
}
