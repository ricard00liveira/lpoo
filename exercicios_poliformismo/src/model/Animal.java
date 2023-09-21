package model;

public abstract class Animal {
    protected double x;
    protected double y;

    public void mover(double x, double y) {
        System.out.printf("Moveu para x: %.2f, y: %.2f",x,y);
    }

    public abstract void desenhar();
}
