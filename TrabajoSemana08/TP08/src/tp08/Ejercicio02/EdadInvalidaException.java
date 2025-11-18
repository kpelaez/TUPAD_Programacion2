package tp08.Ejercicio02;

public class EdadInvalidaException extends Exception {
    
    // Atributo para almacenar la edad inválida
    private int edadInvalida;

    public EdadInvalidaException() {
        super("La edad ingresada no es válida");
    }

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

    public EdadInvalidaException(String mensaje, int edad) {
        super(mensaje);
        this.edadInvalida = edad;
    }
    
    public EdadInvalidaException(int edad) {
        super(generarMensaje(edad));
        this.edadInvalida = edad;
    }
    

    public int getEdadInvalida() {
        return edadInvalida;
    }
    
    private static String generarMensaje(int edad) {
        if (edad < 0) {
            return String.format("Edad inválida: %d. La edad no puede ser negativa.", edad);
        } else if (edad > 120) {
            return String.format("Edad inválida: %d. La edad no puede ser mayor a 120 años.", edad);
        } else {
            return String.format("Edad inválida: %d. La edad debe estar entre 0 y 120 años.", edad);
        }
    }
    

    @Override
    public String toString() {
        return String.format("EdadInvalidaException: %s (Edad ingresada: %d)", 
                           getMessage(), edadInvalida);
    }
}