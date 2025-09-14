package trabajosemana01;
import java.util.Scanner;

public class Correccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORRECCION
        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}

/*
EXPLICACION:
- El error estaba en String nombre = scanner.nextInt();
- nextInt() lee números enteros, pero la variable 'nombre' es de tipo String
- Se debe Cambiar nextInt() por nextLine() para leer texto
*/