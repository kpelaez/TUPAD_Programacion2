package tp08.Ejercicio02;
import java.util.Scanner;

public class ejer04ExcepcionPersonalizada {

    // Constantes para los límites de edad
    private static final int EDAD_MINIMA = 0;
    private static final int EDAD_MAXIMA = 120;
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Registro de Personas");
        System.out.printf("Rango de edad válido: %d - %d años\n\n", EDAD_MINIMA, EDAD_MAXIMA);
        
        boolean continuar = true;
       
        while (continuar) {
            try {
                // Solicitar nombre
                System.out.print("Ingrese el nombre (o 'salir' para terminar): ");
                String nombre = scanner.nextLine().trim();
                
                if (nombre.equalsIgnoreCase("salir")) {
                    continuar = false;
                    continue;
                }
                
                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede estar vacío\n");
                    continue;
                }
                
                // Solicitar edad
                System.out.print("Ingrese la edad: ");
                String edadTexto = scanner.nextLine().trim();
                
                int edad = Integer.parseInt(edadTexto);
                
                // Validar edad
                validarEdad(edad);
                
                System.out.println("Edad válida");
                
                // Registrar persona
                registrarPersona(nombre, edad);
               
                System.out.println("Persona registrada exitosamente\n");
                
            } catch (EdadInvalidaException e) {
                // Capturar específicamente nuestra excepción personalizada
                System.out.println("\nERROR DE VALIDACIÓN");
                System.out.println("Tipo: " + e.getClass().getSimpleName());
                System.out.println("Mensaje: " + e.getMessage());
                System.out.println("Edad ingresada: " + e.getEdadInvalida());
                System.out.println("\nLa persona NO fue registrada.");
                System.out.println("Por favor, ingrese una edad válida.\n");
                
         
            } catch (NumberFormatException e) {
                // Capturar error de formato de número
                System.out.println("\nERROR");
                System.out.println("Detalle: " + e.getMessage() + "\n");

                
            } catch (Exception e) {
                // Capturar cualquier otra excepción
                System.out.println("\nERROR INESPERADO: " + e.getMessage());
                e.printStackTrace();
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < EDAD_MINIMA) {
            // Lanzar excepción con throw
            throw new EdadInvalidaException(
                "La edad no puede ser negativa. Edad ingresada: " + edad, 
                edad
            );
        }
        
        if (edad > EDAD_MAXIMA) {
            throw new EdadInvalidaException(
                "La edad no puede ser mayor a " + EDAD_MAXIMA + " años. Edad ingresada: " + edad,
                edad
            );
        }
        
        System.out.println("Edad está en el rango válido");
    }

    private static void registrarPersona(String nombre, int edad) {
      System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
        
}
