package model;

public class Caminhao extends Veiculo implements Automovel {
    private int capacidadeDeCarga;
    private String placa;
    private String renavam;
    private String chassi;

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String placa, String renavam, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nCaminhao {" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
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
