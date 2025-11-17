package tp06.Ejercicio03;
import java.util.ArrayList;
import java.util.List;


public class Profesor {
    // Atributos de la clase
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Relación 1 a N

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Métodos getters y setters
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso c) {
       
        if (!cursos.contains(c)) {
            cursos.add(c);
            
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }


    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("No dicta cursos actualmente.");
        } else {
            for (Curso curso : cursos) {
                System.out.println(curso.getCodigo() + " - " + curso.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
    
    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cantidadCursos=" + cursos.size() +
                '}';
    }

}
