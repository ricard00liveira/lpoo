package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(2,"Humana","Caloi","Adventure",2020,26,"XYZ@23");
        System.out.println(b1);

        Carro car1 = new Carro(4,"Automotor","Honda","City",2023,510,"IFE5641","879878","D54A6D4AS");
        System.out.println(car1);

        Caminhao c1 = new Caminhao(6,"Automotor","Mercedes","Benz",2023,1000,"IXT0272","812312","21DAS5D4AS5D");
        System.out.println(c1);

        //Instanciando objetos
        Bicicleta b2 = new Bicicleta(2,"Humana","Sundown","AB",2021,29,"XVB");
        Bicicleta b3 = new Bicicleta(2,"Humana","Sun","AB2",2000,26,"XVB");
        Bicicleta b4 = new Bicicleta(2,"Humana","Down","AB3",2010,24,"XVB");
        Bicicleta b5 = new Bicicleta(2,"Humana","Sundown","AB4",2052,24,"XVB");

        Carro car2 = new Carro(4,"Automotor","Honda","Civic",2022,510,"IDK8434","321654","321XCZ12");
        Carro car3 = new Carro(4,"Automotor","VW","Gol",2020,510,"IKD9239","7984654","2SA5D4AS56");
        Carro car4 = new Carro(4,"Automotor","Fiat","Palio",2021,510,"LPR0974","546218","5A4DAS1D2S");
        Carro car5 = new Carro(4,"Automotor","Jeep","Renegade",2019,510,"ITO2080","9872618","AD1V8C4TER");

        Caminhao c2 = new Caminhao(6,"Automotor","Mercedes","Benz",2023,1000,"ICB6542","8972052","BCV4TY54GSD2");
        Caminhao c3 = new Caminhao(6,"Automotor","Volvo","ABC",2016,1000,"AGO0797","45423466","9K5H4D5G4F");
        Caminhao c4 = new Caminhao(6,"Automotor","Volvo","CDE",2009,1000,"IWA2032","12324234","8JADKAJSDKAS");
        Caminhao c5 = new Caminhao(6,"Automotor","Mercedes","ZXY",2008,1000,"WW9835","212125","54ASD56AS4D4");

        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(b1);
        veiculosList.add(b2);
        veiculosList.add(b3);
        veiculosList.add(b4);
        veiculosList.add(b5);
        veiculosList.add(car1);
        veiculosList.add(car2);
        veiculosList.add(car3);
        veiculosList.add(car4);
        veiculosList.add(car5);
        veiculosList.add(c1);
        veiculosList.add(c2);
        veiculosList.add(c3);
        veiculosList.add(c4);
        veiculosList.add(c5);

        System.out.println(veiculosList);
        //Ordenar pelo ano de fabricação

        //Imprimir Automovel
        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculosList);

        System.out.println("\n\nLista de Automoveis:");
        veiculosList.forEach(veiculo -> {
            if(veiculo instanceof Automovel) {
                System.out.print(veiculo);
        }
        });

        System.out.println("\n\nLista de Bicicletas:");
        veiculosList.forEach(veiculo -> {
            if(veiculo instanceof Bicicleta) {
                System.out.print(veiculo);
            }
        });

        System.out.println("\n\nOrdenar pelo ano crescente:");
        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(veiculosList);

        System.out.println("\nPLACAs I:");
        veiculosList.forEach(veiculo -> {
            if(veiculo instanceof Automovel) {
                if(((Automovel) veiculo).getPlaca().startsWith("I")) {
                    System.out.print(veiculo);
                }
            }
        });
    }
}
