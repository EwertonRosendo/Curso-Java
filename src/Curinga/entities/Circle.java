package Curinga.entities;

public class Circle  implements  Shape{
    private double raio;
    private final double pi = 3;

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double totalArea() {
        return pi*raio*raio;
    }
}
