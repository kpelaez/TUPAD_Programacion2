package tp03;

class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;
    

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Nueva calificación: " + calificacion);
    }
    

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Nueva calificación: " + calificacion);
    }
}

public class Ejercicio01 {
    public static void main(String[] args) {
        // Instanciar estudiante
        Estudiante estudiante = new Estudiante("Juan", "Perez", "Programación 2", 7.5);
        
        estudiante.mostrarInfo();
        
        System.out.println();
        
        // Aumentar calificación
        estudiante.subirCalificacion(1.5);
        
        System.out.println();
        
        // bajar calificación
        estudiante.bajarCalificacion(0.8);
        
        System.out.println();

        estudiante.mostrarInfo();
    }
}
