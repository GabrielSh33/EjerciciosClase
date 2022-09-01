public class Estudiante extends Persona {
    String noCuenta;
    String curso;
    String calificacion;

    public Estudiante(String nombre, int edad, String sexo, String direccion, String noCuenta, String curso, String calificacion) {
        super(nombre, edad, sexo, direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void verCalificacion(){
        System.out.println("La calificacion de "+getNombre()+" es"+calificacion);
    }
    public void verCurso(){
        System.out.println("El curso es: "+curso);
    }

}

