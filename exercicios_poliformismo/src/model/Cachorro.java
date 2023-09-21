package model;

public class Cachorro extends Animal{

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um CACHORRO");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
