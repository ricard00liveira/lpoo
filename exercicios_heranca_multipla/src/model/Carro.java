package model;

public class Carro extends Veiculo implements Automovel{
    private int capacidadePortaMalas;
    private String placa;
    private String renavam;
    private String chassi;

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String placa, String renavam, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nCarro {" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                ", placa='" + placa + '\'' +
                ", renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
