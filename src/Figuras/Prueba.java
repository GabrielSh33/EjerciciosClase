package Figuras;

public class Prueba {
    public static void main(String[] args) {
        Triangulo t1= new Triangulo(4,6,3,4,4);
        System.out.println("El area del triangulo es: " + t1.getArea());
        System.out.println("El perimetro es: "+ t1.getPerimetro());
        Figura f1=new Figura(){


            @Override
            public void calculaArea() {

            }

            @Override
            public void calcularPerimetro() {

            }
        };

}
}

