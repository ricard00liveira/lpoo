package model;

public class Cliente implements Associado{

    private int qdeCotas;
    private double valorCota;
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente {\n" +
                "nome='" + nome + '\n' +
                "qdeCotas=" + qdeCotas + '\n' +
                "valorCota=" + valorCota +
                '\n' +'}';
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }
}
