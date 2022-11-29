package Tutoriales;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializacion {
    public static void main(String[] args) {

        Administrador jefe=new Administrador("Juan", 800000, 2005,12,15);

        jefe.setIncentivo(5000);

        Empleado[] persona1= new Empleado[3];

        persona1[0]=jefe;
        persona1[1]= new Empleado("Ana", 25000, 2008, 10,1);
        persona1[2]= new Empleado("Luis", 18000, 2012, 9,15);
        try{
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:/XD/empleado.dat"));
            escribiendo_fichero.writeObject(persona1);
            escribiendo_fichero.close();
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/XD/empleado.dat"));
            Empleado[] personal_recuperado=(Empleado[]) recuperando_fichero.readObject();
            recuperando_fichero.close();

            for(Empleado e : personal_recuperado){
                System.out.println(e);
            }

        }catch (Exception e){


        }
    }
}
//______________________________________________________________
class Empleado implements Serializable {
    public Empleado(String n, double s, int agno, int mes,int dia){
        nombre=n;
        sueldo=s;

        GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);
        fechaContrato=calendario.getTime();
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Date getFechaContrato(){
        return fechaContrato;
    }

    public void setSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    public String toString(){
        return "Nombre=" + nombre + ", sueldo=" + sueldo + ", fecha de contrato=" + fechaContrato;
    }
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
}

//____________________________________________________
class Administrador extends Empleado {
    public Administrador(String n, double s, int agno, int mes, int dia){
        super(n,s,agno,mes,dia);
        incentivo=0;
    }
    public double getSueldo(){
        double sueldoBase=super.getSueldo();
        return sueldoBase + incentivo;
    }
    public void setIncentivo(double b){
        incentivo=b;
    }
    public String toString(){
        return super.toString() + " Incentivo" +incentivo;
    }
    private double incentivo;
}
