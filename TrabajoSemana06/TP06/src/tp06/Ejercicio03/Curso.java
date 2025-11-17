package tp06.Ejercicio03;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Relación N a 1

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor asignado
    }

    // Métodos getters y setters
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Si ya tenía un profesor asignado, quitar de su lista
        if (this.profesor != null && this.profesor != p) {
            Profesor profesorAnterior = this.profesor;
            this.profesor = null;
            profesorAnterior.eliminarCurso(this);
        }

        // Asignar el nuevo profesor
        this.profesor = p;

        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Especialidad: " + profesor.getEspecialidad());
        } else {
            System.out.println("Profesor: Sin asignar");
        }
    }
    
    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor='" + nombreProfesor + '\'' +
                '}';
    }

}