package model;

public interface Associado {
    int qdeCotas = 0;
    double valorCota = 0;
    public abstract double lucros(int qdeCotas, double valorCota);
}
