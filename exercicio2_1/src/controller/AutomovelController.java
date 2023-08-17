package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel();
        System.out.println(auto1);
        Automovel auto2 = new Automovel("1234","IDK9845","Branco",4,"Gasolina",345000,"9KFGDA",230.90);
        System.out.println(auto2);

        auto1.setRenavan("4321");
        auto1.setPlaca("KJU9921");
        auto1.setCor("Verde");
        auto1.setNum_rodas(5);
        auto1.setCombustivel("Alcool");
        auto1.setQuilometragem(432211);
        auto1.setChassi("7ASG654DSA");
        auto1.setValor_locacao(245.99);

        System.out.println("Valor de alocação: " + auto1.getValor_locacao());

    }
}
