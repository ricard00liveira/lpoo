package model;

public class Cliente implements Associado{

    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
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
