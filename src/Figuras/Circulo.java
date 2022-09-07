package Figuras;

public class Circulo extends Figura{
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio) {
        this.radio = radio;

    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }


    @Override
    public String toString() {
        return "Circulo{ " +
                "radio= " + radio +
                ", area= " + calcularArea() +
                ", perimetro= " + calcularPerimetro() +
                '}';
    }
}


