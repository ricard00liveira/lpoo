package controller;
import model.Conta;

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
}
}
