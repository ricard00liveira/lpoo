package model;

import java.util.Objects;

public class Carro {
    //Atributos

    private Long id;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    //Construtores

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, int anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

//Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //toString


    @Override
    public String toString() {
        return "\nCarro { " +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Carro carro = (Carro) o;

        return Objects.equals(id, carro.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
