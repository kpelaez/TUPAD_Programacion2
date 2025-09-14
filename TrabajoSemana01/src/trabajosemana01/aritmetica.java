package trabajosemana01;
import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        double division = (double) num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multi);
        System.out.println("Division: " + division);
    }
}
