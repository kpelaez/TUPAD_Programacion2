package tp06.Ejercicio03;
import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;


    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos getters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }


    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }


    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("No se encontró el curso con código: " + codigoCurso);
            return false;
        }

        if (profesor == null) {
            System.out.println("No se encontró el profesor con ID: " + idProfesor);
            return false;
        }

        curso.setProfesor(profesor);
        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
        return true;
    }

   
    public void listarProfesores() {

        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }

        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
        System.out.println("Total de profesores: " + profesores.size());
    }


    public void listarCursos() {
 
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        for (Curso c : cursos) {
            c.mostrarInfo();
        }
        System.out.println("Total de cursos: " + cursos.size());
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }


    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);

        if (cursoAEliminar != null) {
            // Romper la relación con el profesor
            if (cursoAEliminar.getProfesor() != null) {
                cursoAEliminar.setProfesor(null);
            }

            cursos.remove(cursoAEliminar);
            System.out.println("Curso eliminado: " + cursoAEliminar.getNombre());
            return true;
        } else {
            System.out.println("No se encontró el curso con código: " + codigo);
            return false;
        }
    }

    public boolean eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);

        if (profesorAEliminar != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(profesorAEliminar.getCursos());

            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }

            profesores.remove(profesorAEliminar);
            System.out.println("Profesor eliminado: " + profesorAEliminar.getNombre());
            return true;
        } else {
            System.out.println("No se encontró el profesor con ID: " + id);
            return false;
        }
    }

    public void mostrarReporteCursosPorProfesor() {

        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }

        for (Profesor p : profesores) {
            System.out.println("\nProfesor: " + p.getNombre());
            System.out.println("Especialidad: " + p.getEspecialidad());
            System.out.println("Cantidad de cursos: " + p.getCursos().size());
            
            if (!p.getCursos().isEmpty()) {
                System.out.println("Cursos:");
                for (Curso c : p.getCursos()) {
                    System.out.println(c.getCodigo() + " - " + c.getNombre());
                }
            } else {
                System.out.println("  (No dicta cursos)");
            }
        }
    }
    
    
}