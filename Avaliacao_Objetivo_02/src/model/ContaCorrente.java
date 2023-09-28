package model;

public class ContaCorrente extends Conta implements Associado{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente {" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }
}
