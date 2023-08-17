package model;

public class Conta {
    //Atributos
    private double saldo;

    //Construtores

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //Getters and Setters

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        if(taxa < 1) {
            taxa = taxa * 100;
        }
        this.saldo += this.saldo*(taxa/100);
    }

    //toString

    @Override
    public String toString() {
        return "Conta {" +
                "saldo=" + saldo +
                '}';
    }
}
