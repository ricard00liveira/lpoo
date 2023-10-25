package controller;

import model.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class LojaController {
    public static void main(String[] args) {
        /* Faça a aplicação realizar duas vendas de dois produtos. Salve as vendas em uma
        coleção. Cada venda deve registrar: 1) os itens vendidos, os produtos de cada um desses
        itens, o total do item, bem como o pedido e o total do pedido; 2) o vendedor que fez a venda;
        3) Baixar o estoque de cada produto vendido. Imprima a coleção com as duas vendas
        realizadas (o relatório de vendas). Imprima o estoque de produtos após as vendas. */

        Fornecedor f1 = new Fornecedor(1, "33090101", "Taqi");

        Produto p1 = new Produto(1, "Cimento", 200, 40.0, f1);
        Produto p2 = new Produto(2, "Argamassa", 200, 18.0, f1);

        Item i1 = new Item(1, 5.0, 5, p1);
        Item i2 = new Item(2, 10, 5, p2);

        List<Item> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        Vendedor v1 = new Vendedor(1, "Robson", "Av Duque de Caxias", "Fragata", "96030-000", "Pelotas", "RS", "Taqi");

        Pedido pedido1 = new Pedido(1, new GregorianCalendar(2023,10, 24), p1.getPreco()* i1.getQuantidade()+p2.getPreco()* i2.getQuantidade(), v1, Tipo.PENDENTE, itens);

        Produto p3 = new Produto(3, "Telha", 200, 10.0, f1);
        Produto p4 = new Produto(4, "Madeira", 500, 1.0, f1);

        Item i3 = new Item(3, 1.0, 10, p3);
        Item i4 = new Item(4, 5.0, 20, p4);

        itens.clear();
        itens.add(i3);
        itens.add(i4);

        Pedido pedido2 = new Pedido(2, new GregorianCalendar(2023,10,24), p3.getPreco()* i3.getQuantidade()+p4.getPreco()* i4.getQuantidade(), v1, Tipo.PENDENTE, itens);



    }
}
