package Escuela;

import Escuela.Estudiante;
import Escuela.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona p1=new Persona("Maria",12,"F","jocotitlan");
        Estudiante e1=new Estudiante("Gabriel",18,"M","Santiago Casandeje","2124687","Paradigmas","B");

        e1.mostrarInfo();
        p1.mostrarInfo();

    }
}