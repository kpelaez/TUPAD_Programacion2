package tp06.Ejercicio02;

public class MainEjercicio02 {
    public static void main(String[] args) {

        // TAREA 1
        System.out.println("TAREA 1: Creando biblioteca");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional Argentina");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        // TAREA 2
        System.out.println("\nTAREA 2: Creando autores");
        Autor autor1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor autor2 = new Autor("A002", "Gabriel García Márquez", "Colombia");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chile");
        
        System.out.println("Autores creados:");
        System.out.println("  - " + autor1.getNombre());
        System.out.println("  - " + autor2.getNombre());
        System.out.println("  - " + autor3.getNombre());

        // TAREA 3
        System.out.println("\nTAREA 3: Agregando libros a la biblioteca");
        biblioteca.agregarLibro("ISBN-001", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("ISBN-002", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("ISBN-003", "Cien años de soledad", 1967, autor2);
        biblioteca.agregarLibro("ISBN-004", "El amor en los tiempos del cólera", 1985, autor2);
        biblioteca.agregarLibro("ISBN-005", "La casa de los espíritus", 1982, autor3);

        // TAREA 4
        System.out.println("\nTAREA 4: Listando todos los libros");
        biblioteca.listarLibros();

        // TAREA 5
        System.out.println("\nTAREA 5: Buscando libro por ISBN");
        String isbnBuscar = "ISBN-003";
        System.out.println("Buscando libro con ISBN: " + isbnBuscar);
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // TAREA 6
        System.out.println("\nTAREA 6: Filtrando libros por año");
        biblioteca.filtrarLibrosPorAnio(1985);

        // TAREA 7
        System.out.println("\nTAREA 7: Eliminando libro");
        biblioteca.eliminarLibro("ISBN-002");
        System.out.println("\nListado después de eliminar:");
        biblioteca.listarLibros();

        // TAREA 8
        System.out.println("\nTAREA 8: Cantidad total de libros");
        int cantidadLibros = biblioteca.obtenerCantidadLibros();
        System.out.println("Total de libros en la biblioteca: " + cantidadLibros);

        // TAREA 9
        System.out.println("\nTAREA 9: Listando autores disponibles");
        biblioteca.mostrarAutoresDisponibles();

    }
}