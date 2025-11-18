package tp08.Ejercicio02;
import java.util.Scanner;

public class ejer02ConversionANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa convierte texto a número entero.");
        System.out.println("Ejemplos válidos: 123, -456, 0");
        System.out.println("Ejemplos inválidos: abc, 12.5, 1a2\n");
        
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.print("Ingrese un texto para convertir a número (o 'salir' para terminar): ");
                String texto = scanner.nextLine();
                
                // Verificar si el usuario quiere salir
                if (texto.equalsIgnoreCase("salir")) {
                    continuar = false;
                    continue;
                }
                
                int numero = convertirANumero(texto);
                
                // Si llegamos aquí, la conversión fue exitosa
                System.out.printf("Texto ingresado: \"%s\"\n", texto);
                System.out.printf("Número obtenido: %d\n", numero);
                System.out.printf("Número al cuadrado: %d\n", numero * numero);
                System.out.printf("Número es par: %s\n\n", (numero % 2 == 0) ? "Sí" : "No");

                
            } catch (NumberFormatException e) {
                // Capturar la excepción cuando la conversión falla
                System.out.println("\nERROR: El texto ingresado no es un número válido");
                System.out.println("Mensaje de la excepción: " + e.getMessage());
                System.out.println("Intente nuevamente con un número válido.\n");

            } catch (Exception e) {
                System.out.println("\nERROR: " + e.getMessage());
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
    private static int convertirANumero(String texto) throws NumberFormatException {
        // Integer.parseInt() puede lanzar NumberFormatException
        return Integer.parseInt(texto);
    }
}
