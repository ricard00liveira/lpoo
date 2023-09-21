package model;

public class Peixe extends Animal{
    private double z;

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
    super.mover(x,y);
    this.z = z;
    }


    @Override
    public void desenhar() {
        System.out.println("Desenhou um PEIXE");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
