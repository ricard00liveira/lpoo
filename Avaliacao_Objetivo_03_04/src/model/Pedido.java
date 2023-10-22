package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;
    private Vendedor vendedor;

    private TipoPedido tipo;
    private List<Item> item;
}
