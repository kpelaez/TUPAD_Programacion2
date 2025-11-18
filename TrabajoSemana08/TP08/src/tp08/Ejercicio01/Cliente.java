package tp08.Ejercicio01;

public class Cliente implements Notificable {
    // Atributos privados
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("NOTIFICACIÓN PARA: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Mensaje: " + mensaje);
    }
    

    @Override
    public String toString() {
        return String.format("Cliente: %s (%s)", nombre, email);
    }
}