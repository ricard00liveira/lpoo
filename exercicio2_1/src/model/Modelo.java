package model;

public class Modelo {

    //Atributos

    private String descricao;

    //Construtores

    public Modelo() {
    }

    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    //Getters and Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //toString


    @Override
    public String toString() {
        return "Modelo {" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
