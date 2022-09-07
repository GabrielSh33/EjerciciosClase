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
    public abstract void calculaArea();


    public abstract void calcularPerimetro();
}

