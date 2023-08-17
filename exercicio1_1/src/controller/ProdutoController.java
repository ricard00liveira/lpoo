package controller;
import model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        System.out.println(p1);
        Produto p2 = new Produto("Chave","Ferramenta de mão", 12.50, 25);
        System.out.println(p2);

        p1.setNome("Martelo");
        p1.setDescricao("Ferramenta para bater");
        p1.setValor(20.99);
        p1.setEstoque(15);
        System.out.println(p1.getNome() + " " + p1.getDescricao());
        System.out.println(p1);
    }
}
