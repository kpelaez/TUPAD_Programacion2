package tp08.Ejercicio01;

public class Producto implements Pagable {
    // Atributos privados
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double calcularTotal() {
        return this.precio;
    }
    
    @Override
    public String toString() {
        return String.format("%s - $%.2f", nombre, precio);
    }
}