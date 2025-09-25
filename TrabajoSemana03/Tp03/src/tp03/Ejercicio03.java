package tp03;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación correcto: " + anioPublicacion);
        } else {
            System.out.println("Invalido -  El año de publicación debe estar entre 1 y 2025.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }
}

public class Ejercicio03 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        
        libro.mostrarInfo();
        
        System.out.println();
        
        System.out.println("Modificar con valor inválido: 2030");
        libro.setAnioPublicacion(2030);
        
        System.out.println();
        
        System.out.println("Modificando con valor válido: 2020");
        libro.setAnioPublicacion(2020); // Valor válido
        
        System.out.println();
        
        libro.mostrarInfo();
        
        System.out.println("Título obtenido: " + libro.getTitulo());
        System.out.println("Autor obtenido: " + libro.getAutor());
        System.out.println("Año obtenido: " + libro.getAnioPublicacion());
    }
}
