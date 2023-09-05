package model;

public class Carro extends Veiculo implements Automovel{
    private int capacidadePortaMalas;

    @Override
    public String toString() {
        return "Carro { " +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                '}';
    }

    @Override
    public String getRenavam() {
        return null;
    }

    @Override
    public void setRenavam(String renavam) {

    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public void setPlaca(String placa) {

    }
}
