package model;

public class Funcionario {
    //Atributos
    private String nome;
    private double salario;

    //Construtores

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //toString
    @Override
    public String toString() {
        return "Funcionario {" +
                "\nnome='" + nome + '\'' +
                ", \nsalario=" + salario +
                "\n}\n";
    }
}
