package controller;
import model.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1);
        Carro c2 = new Carro(2L,"Honda","City",2012);
        System.out.println(c2);

        c1.setId(1L);
        c1.setMarca("VW");
        c1.setModelo("Gol");
        c1.setAnoFabricacao(2020);

        System.out.println("Carro: " + c1.getMarca() + "\nModelo: " + c1.getModelo() + "\nAno: " + c1.getAnoFabricacao());

        Carro c3 = new Carro(3L,"VW","Gol",2020);
        Carro c4 = new Carro(4L,"Chevrolet","Monza",1984);
        Carro c5 = new Carro(3L,"VW","Gol",2020);

        //List
        List<Carro> carrosList = new ArrayList<>();

        carrosList.add(c1);
        carrosList.add(c2);
        carrosList.add(c3);
        carrosList.add(c4);
        carrosList.add(c5);

        System.out.println("Lista de Carros: " + carrosList);

        System.out.println("\n\nLocalizando o id=3: ");
        Carro carroFind = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind);

        //Ordenando a lista pelo Id

        carrosList.sort(Comparator.comparing(Carro::getId));
        System.out.println("\nColeção do tipo List em ordem crescente, chave id");
        System.out.println(carrosList);

    }
}
