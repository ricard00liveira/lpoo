package model;

public class Passaro extends Animal {

    private double z;

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x,y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um PASSARO!");
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
