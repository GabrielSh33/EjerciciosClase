package Figuras;
import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {

        boolean enEjecucion= true;

        do{

            System.out.println("1.Cuadrado: ");
            System.out.println("2.Triangulo: ");
            System.out.println("Seleccione una opcion: ");
            Scanner sc = new Scanner (System.in);
            int opcion= sc.nextInt();

            switch(opcion){
                case 1:{
                    Cuadrado c1 = new Cuadrado(3);
                    System.out.println( "El area del cuadrado es "+ c1.calcularArea()+ " y su perimetro es "+
                            c1.calcularPerimetro()
                    );
                    break;

                }
                case 2:{
                    Triangulo triangulo = new Triangulo (5,4,7);
                    System.out.println("El area del triangulo es "+ triangulo.calcularArea()+ " y su perimetro es "+
                            triangulo.calcularPerimetro());
                    break;
                }

                default:{
                    System.out.println("No existe la opción disponible");
                }

            }
            System.out.println("¿Desea realizar otra operacion? Si/No");
            String respuesta = leerTeclado();
            if(respuesta.equalsIgnoreCase("No")){
                enEjecucion=false;
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

