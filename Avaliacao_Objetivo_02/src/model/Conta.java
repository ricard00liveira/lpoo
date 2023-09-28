package model;

public abstract class Conta  {
    protected double saldo;

    public Conta() { }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += (this.saldo*taxa);

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "saldo=" + saldo +
                '}';
    }
}
