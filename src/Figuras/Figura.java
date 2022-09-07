package Figuras;

public abstract class Figura {

    protected double area;
    protected double perimetro;

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }
    public abstract double calcularArea();


    public abstract double calcularPerimetro();

    public abstract String toString();

}

