package model;

public class ContaCorrente extends Conta implements Associado{
    private int qdeCotas;
    private double valorCota;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                "} ";
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }
}
