package controller;
import model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
    Conta conta1 = new Conta();
    System.out.println(conta1);
    Conta conta2 = new Conta(1000);
    System.out.println(conta2);

    conta1.deposita(500);
        System.out.println(conta1.getSaldo());
    conta1.atualiza(10);
        System.out.println(conta1.getSaldo());
    conta1.atualiza(0.5);
        System.out.println(conta1.getSaldo());
    conta1.saca(500);
        System.out.println(conta1.getSaldo());

        Conta conta3 = new Conta(1000);
        Conta conta4 = new Conta(15000);
        Conta conta5 = new Conta(1000000);

        List<Conta> contasList = new ArrayList<>();

        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);

        System.out.println("Lista de contas: \n" + contasList);





}
}
