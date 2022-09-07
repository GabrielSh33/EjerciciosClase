package Figuras;
import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {

        boolean enEjecucion = true;

        do {

            System.out.println("1.Triangulo: ");
            System.out.println("2.Cuadradoo: ");
            System.out.println("3.Circulo: ");
            System.out.println("4.Salir del programa: ");
            System.out.println("---------------------------------------------------------");
            System.out.println("SELECCIONE UNA OPCION: ");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1: {
                    Triangulo triangulo = new Triangulo(5, 4, 7);
                    System.out.println("El area del triangulo es " + triangulo.calcularArea() +
                            " y su perimetro es " + triangulo.calcularPerimetro());
                    break;
                }
                case 2: {
                    Cuadrado c1 = new Cuadrado(3);
                    System.out.println("El area del cuadrado es " + c1.calcularArea() + " " +
                            "y su perimetro es " + c1.calcularPerimetro());
                    break;
                }
                case 3: {
                    Circulo circulo = new Circulo(5);
                    System.out.println("El  area de circulo es " + circulo.calcularArea() +
                            " y su perimetro es " + circulo.calcularPerimetro());
                    break;
                }

                case 4: {
                    System.out.println("Salir del programa");
                    return;
                }

            }

        }while(enEjecucion);
    }
    private static String leerTeclado (){
        String retorno= "";
        Scanner sc =  new Scanner (System.in);
        retorno= sc.nextLine();
        return retorno;
    }
}