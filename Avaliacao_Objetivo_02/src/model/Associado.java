package model;

public interface Associado {
    int qdeCotas = 0;
    double valorCota = 0;


    public abstract double lucros(int qdeCotas, double valorCota);
    public abstract int getQdeCotas();
    public abstract void setQdeCotas(int qdeCotas);

    public abstract double getValorCota();
    public abstract void setValorCota(double valorCota);
}
