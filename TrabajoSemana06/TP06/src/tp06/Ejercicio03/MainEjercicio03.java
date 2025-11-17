package tp06.Ejercicio03;

public class MainEjercicio03 {
    public static void main(String[] args) {

        // Crear la universidad
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");
        System.out.println("Universidad creada: " + utn.getNombre() + "\n");

        // TAREA 1
        System.out.println("TAREA 1: Creando profesores y cursos");
        
        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Programación");
        Profesor prof2 = new Profesor("P002", "Dra. María González", "Matemática");
        Profesor prof3 = new Profesor("P003", "Ing. Carlos Rodríguez", "Bases de Datos");
        
        // Crear cursos
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Álgebra y Geometría");
        Curso curso4 = new Curso("C004", "Análisis Matemático");
        Curso curso5 = new Curso("C005", "Bases de Datos");

        // TAREA 2
        System.out.println("\nTAREA 2: Agregando a la universidad");
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);

        // TAREA 3
        System.out.println("\nTAREA 3: Asignando profesores a cursos");
        utn.asignarProfesorACurso("C001", "P001");
        utn.asignarProfesorACurso("C002", "P001"); 
        utn.asignarProfesorACurso("C004", "P002");
        utn.asignarProfesorACurso("C005", "P003");

        // TAREA 4
        System.out.println("\nTAREA 4: Listando cursos y profesores");
        utn.listarCursos();
        utn.listarProfesores();
        
        System.out.println("\nCursos por profesor");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();

        // TAREA 5
        System.out.println("\nTAREA 5: Cambiando profesor de un curso");
        System.out.println("\nAntes del cambio:");
        curso2.mostrarInfo();
        prof1.listarCursos();
        prof3.listarCursos();
        
        System.out.println("\nCambiando profesor de 'Programación II' de Prof. Pérez a Prof. Rodríguez...");
        utn.asignarProfesorACurso("C002", "P003");
        
        System.out.println("\nDespués del cambio:");
        curso2.mostrarInfo();
        
        System.out.println("\nVerificando sincronización bidireccional:");
        System.out.println("Cursos del Prof. Pérez (debería tener solo Programación I):");
        prof1.listarCursos();
        System.out.println("\nCursos del Prof. Rodríguez (debería tener BD y Programación II):");
        prof3.listarCursos();

        // TAREA 6
        System.out.println("\nTAREA 6: Eliminando un curso");
        System.out.println("\nAntes de eliminar:");
        prof2.listarCursos();
        
        utn.eliminarCurso("C003");
        
        System.out.println("\nDespués de eliminar 'Álgebra y Geometría':");
        prof2.listarCursos();
        System.out.println("\nListado de cursos de la universidad:");
        utn.listarCursos();

        // TAREA 7
        System.out.println("\nTAREA 7: Eliminando un profesor");
        System.out.println("\nAntes de eliminar:");
        curso4.mostrarInfo();
        
        utn.eliminarProfesor("P002");
        
        System.out.println("\nDespués de eliminar a la Prof. González:");
        curso4.mostrarInfo();

        // TAREA 8
        System.out.println("\nTAREA 8: Reporte de cursos por profesor");
        utn.mostrarReporteCursosPorProfesor();

    }
}