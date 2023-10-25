package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {
    private int numero;
    private Calendar data;
    private double valor;
    private Vendedor vendedor;

    private Tipo tipo;
    private List<Item> itens = new ArrayList<>();

    public Pedido() {
    }


    public Pedido(int numero, Calendar data, double valor, Vendedor vendedor, Tipo tipo, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.tipo = tipo;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data.get(Calendar.DAY_OF_MONTH) + "/" + data.get(Calendar.MONTH) + "/" +data.get(Calendar.YEAR) +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", tipo=" + tipo +
                ", itens=" + itens +
                '}';
    }

}
