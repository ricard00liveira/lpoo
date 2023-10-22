package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;
    private List<Item> itens = new ArrayList<>();

    //Construtores

    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public Produto(int codigo, String nome, int quantidade, double preco, List<Item> itens) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.itens = itens;
    }
}
