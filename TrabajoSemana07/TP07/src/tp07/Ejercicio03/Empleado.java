package tp07.Ejercicio03;

public abstract class Empleado {
    // Atributos protegidos
    protected String nombre;
    protected String apellido;
    protected int dni;
    
   
    public Empleado(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public abstract double calcularSueldo();
    
  
    public void mostrarInfo() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo: $" + String.format("%.2f", calcularSueldo()));
    }
    
    
    public abstract String getTipoEmpleado();
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getDni() {
        return dni;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
}