package controller;

import model.Bicicleta;
import model.Caminhao;
import model.Carro;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(2,"Humana","Caloi","Adventure",2020,26,"XYZ@23");
        System.out.println(b1);

        Carro car1 = new Carro(4,"Automotor","Honda","City",2023,510);
        System.out.println(car1);

        Caminhao c1 = new Caminhao(6,"Automotor","Mercedes","Benz",2023,1000);
        System.out.println(c1);

        //Instanciando objetos
        Bicicleta b2 = new Bicicleta(2,"Humana","Sundown","AB",2021,29,"XVB");
        Bicicleta b3 = new Bicicleta(2,"Humana","Sun","AB2",2000,26,"XVB");
        Bicicleta b4 = new Bicicleta(2,"Humana","Down","AB3",2010,24,"XVB");
        Bicicleta b5 = new Bicicleta(2,"Humana","Sundown","AB4",2052,24,"XVB");

        Carro car2 = new Carro(4,"Automotor","Honda","Civic",2022,510);
        Carro car3 = new Carro(4,"Automotor","VW","Gol",2020,510);
        Carro car4 = new Carro(4,"Automotor","Fiat","Palio",2021,510);
        Carro car5 = new Carro(4,"Automotor","Jeep","Renegade",2019,510);

        Caminhao c2 = new Caminhao(6,"Automotor","Mercedes","Benz",2023,1000);
        Caminhao c3 = new Caminhao(6,"Automotor","Volvo","ABC",2016,1000);
        Caminhao c4 = new Caminhao(6,"Automotor","Volvo","CDE",2009,1000);
        Caminhao c5 = new Caminhao(6,"Automotor","Mercedes","ZXY",2008,1000);

        List<Veiculo> veiculosList = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(car1);
        veiculos.add(car2);
        veiculos.add(car3);
        veiculos.add(car4);
        veiculos.add(car5);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);

        System.out.println(veiculosList);



    }
}
