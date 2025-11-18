package tp07.Ejercicio02;

public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " unidades²");
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }
    
    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}