package Figuras;

public abstract class Figura {

    protected double area;
    protected double perimetro;
    protected double radio;

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }
    public double getRadio(){
        return radio;
    }
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract String toString();

}

