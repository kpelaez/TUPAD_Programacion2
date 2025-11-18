package tp08.Ejercicio02;
import java.util.Scanner;

public class ejer01DivisionCero {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         try {
            // Solicitar el dividendo
            System.out.print("Ingrese el dividendo (número a dividir): ");
            int dividendo = scanner.nextInt();
            
            // Solicitar el divisor
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividir(dividendo, divisor);

            System.out.println("Operación exitosa");
            System.out.printf("Resultado: %d ÷ %d = %d\n", dividendo, divisor, resultado);
            System.out.printf("Resultado decimal: %.2f\n", (double)dividendo / divisor);
            
        } catch (ArithmeticException e) {
            // Capturar la excepción de división por cero
            System.out.println("\nERROR: No se puede dividir por cero");
            System.out.println("Mensaje de error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("\nERROR: Entrada inválida");
            System.out.println("Detalle: " + e.getMessage());
            
        }
    }

    private static int dividir(int dividendo, int divisor) throws ArithmeticException {
        // Java automáticamente lanza ArithmeticException si divisor es 0
        return dividendo / divisor;
    }
       
}
