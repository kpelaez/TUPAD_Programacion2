package tp02;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        
        double porcentajeDescuento = 0;
        if (categoria == 'A') {
            porcentajeDescuento = 0.10; // 10%
        } else if (categoria == 'B') {
            porcentajeDescuento = 0.15; // 15%
        } else if (categoria == 'C') {
            porcentajeDescuento = 0.20; // 20%
        }
        
        double descuento = precio * porcentajeDescuento;
        double precioFinal = precio - descuento;
        
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
