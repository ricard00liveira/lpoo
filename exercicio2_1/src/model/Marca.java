package model;

public class Marca {

    //Atributos

    private String descricao;

    //Construtores

    public Marca() {
    }

    public Marca(String descricao) {
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
        return "Marca {" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
