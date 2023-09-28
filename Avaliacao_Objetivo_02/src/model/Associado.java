package model;

public interface Associado {
    protected int qdeCotas;
    protected double valorCota;
    public abstract double lucros(int qdeCotas, double valorCota);
}
