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

        Item i1 = new Item(1, 5.0, 10, p1);
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

        if(p1.getQuantidade() < i1.getQuantidade() || p2.getQuantidade() < i2.getQuantidade() || p3.getQuantidade() < i3.getQuantidade() || p4.getQuantidade() < i4.getQuantidade()) {
            comportamento();
        } else {

            List<Item> itens2 = new ArrayList<>();
            itens2.add(i3);
            itens2.add(i4);

            Pedido pedido2 = new Pedido(2, new GregorianCalendar(2023, 10, 24), p3.getPreco() * i3.getQuantidade() + p4.getPreco() * i4.getQuantidade(), v1, Tipo.PENDENTE, itens2);

            List<Pedido> vendas = new ArrayList<>();
            vendas.add(pedido1);
            vendas.add(pedido2);

            System.out.println("Relatório de vendas:");
            System.out.println(vendas);

            p1.setQuantidade(p1.getQuantidade() - i1.getQuantidade());
            p2.setQuantidade(p2.getQuantidade() - i2.getQuantidade());
            p3.setQuantidade(p3.getQuantidade() - i3.getQuantidade());
            p4.setQuantidade(p4.getQuantidade() - i4.getQuantidade());

            System.out.println("\nEstoque de produtos:\n");
            System.out.println(p1.getNome() + " -> " + p1.getQuantidade() + "\n" +
                    p2.getNome() + " -> " + p2.getQuantidade() + "\n" +
                    p3.getNome() + " -> " + p3.getQuantidade() + "\n" +
                    p4.getNome() + " -> " + p4.getQuantidade());


        /* Faça dois produtos receberem entrada de estoque, podendo vir de um mesmo
        fornecedor. Registre esses eventos em uma coleção e imprima um relatório de todos os
        fornecimentos, indicando o fornecedor, o produto, a data do fornecimento, o valor total de
        cada fornecimento, e o custo total desses fornecimentos */

            double t1 = p1.getPreco() * 100;
            double t2 = p2.getPreco() * 50;

            Fornecimento forn1 = new Fornecimento(new GregorianCalendar(2023, 10, 25), t1, f1, p1);
            Fornecimento forn2 = new Fornecimento(new GregorianCalendar(2023, 10, 25), t2, f1, p2);

            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(forn1);
            fornecimentos.add(forn2);

            System.out.println("\nFORNECIMENTOS:");
            System.out.println(fornecimentos);

            System.out.println("\nCUSTO TOTAL FORNECIMENTOS: R$ " + fornecimentos.stream().mapToDouble(Fornecimento::getValorTotal).sum());
        }
    }

    private static void comportamento(){
        mythrowException();
    }

    private static void mythrowException(){
        try{
            System.out.println("\nErro, estoque insuficiente!");
            throw new EstoqueInsuficiente();
        } catch (EstoqueInsuficiente e){
            e.printStackTrace();
        } finally {
            System.out.println("\nFinally executado mythrowException.");
        }
    }

    static class EstoqueInsuficiente extends Exception {
        public  EstoqueInsuficiente(){
            super("\nErro, estoque insuficiente!");
        }
    }
}
