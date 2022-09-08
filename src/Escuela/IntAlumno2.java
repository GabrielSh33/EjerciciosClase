package Escuela;

public interface IntAlumno2 {
    void mostrarGrado();

    int ObtenerAñosdeCarrera();

    public abstract void entrarCurso();

    default void mostrarHorario(){
        System.out.println("Horario corrido");
    }


}

