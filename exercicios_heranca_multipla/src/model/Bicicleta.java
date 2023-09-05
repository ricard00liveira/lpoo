package model;

public class Bicicleta extends Veiculo{
    private int tamanhoRoda;
    private String chassi;

    @Override
    public String toString() {
        return "Bicicleta {" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
