package tp06.Ejercicio02;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Métodos getters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }


    public void listarLibros() {
        System.out.println("LIBROS DE LA BIBLIOTECA: " + nombre);
        
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        System.out.println("Total de libros: " + libros.size());
    }


    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        } else {
            System.out.println("No se encontró el libro con ISBN: " + isbn);
            return false;
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }


    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("LIBROS PUBLICADOS EN " + anio);
        
        boolean encontrado = false;
        
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay libros publicados en el año " + anio);
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("AUTORES DISPONIBLES:");
       
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        Set<String> autoresUnicos = new HashSet<>();
        
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor().getId());
        }

        for (Libro libro : libros) {
            String idAutor = libro.getAutor().getId();
            if (autoresUnicos.contains(idAutor)) {
                libro.getAutor().mostrarInfo();
                autoresUnicos.remove(idAutor); // Para no mostrar de nuevo
            }
        }
    }
}