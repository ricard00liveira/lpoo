package model;

public abstract class Veiculo {
        private int numeroDeEixos;
        private String propulsao;
        private String marca;
        private String modelo;
        private int anoFabricacao;

    public Veiculo() {
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao) {
        this.numeroDeEixos = numeroDeEixos;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;


    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "numeroDeEixos=" + numeroDeEixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
