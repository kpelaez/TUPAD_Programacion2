package trabajosemana01;
import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // División con enteros
        System.out.print("Ingresa el primer numero entero: ");
        int entero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero entero: ");
        int entero2 = scanner.nextInt();
        
        scanner.nextLine();
        
        int divisionEntera = entero1 / entero2;
        System.out.println("Division entera: " + divisionEntera);
        
        // División con doubles
        System.out.print("Ingresa el primer numero decimal: ");
        double double1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero decimal: ");
        double double2 = scanner.nextDouble();
        
        double divisionDecimal = double1 / double2;
        System.out.println("Division decimal: " + divisionDecimal);
        
        System.out.println("Con enteros obtienes solo la parte entera del resultado.");
        System.out.println("Con doubles obtienes el resultado completo con decimales.");
        
        scanner.close();
    }
    
}
