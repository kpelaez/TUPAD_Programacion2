package tp08.Ejercicio02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejer05TryWithResources {

public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Este programa demuestra el uso de try-with-resources");
        
        // Crear archivos de ejemplo
        crearArchivosEjemplo();
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. Leer archivo con try-with-resources");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");
            
            String opcion = teclado.nextLine().trim();
            
            switch (opcion) {
                case "1":
                    leerArchivoConTryWithResources(teclado);
                    break;
                case "0":
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("\nOpción inválida");
            }
        }
        teclado.close();
    }

    private static void leerArchivoConTryWithResources(Scanner teclado) {
        System.out.print("\nIngrese el nombre del archivo: ");
        String nombreArchivo = teclado.nextLine().trim();
        
        System.out.println("\nLECTURA CON TRY-WITH-RESOURCES\n");
        
        // Try-with-resources: el recurso se cierra automáticamente
        // BufferedReader implementa AutoCloseable
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Archivo abierto correctamente");
            System.out.println("\nCONTENIDO DEL ARCHIVO\n");
            
            String linea;
            int numeroLinea = 1;
            int totalCaracteres = 0;
            
            // Leer el archivo línea por línea
            while ((linea = lector.readLine()) != null) {
                System.out.printf("%3d | %s\n", numeroLinea, linea);
                numeroLinea++;
                totalCaracteres += linea.length();
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("\nERROR: Archivo no encontrado");
            System.out.println("Detalle: " + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("\nERROR DE LECTURA: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
            
        } finally {
            System.out.println("\nRecurso cerrado automáticamente por try-with-resources");
        }
        
    }
    

    private static void crearArchivosEjemplo() {
        // Crear datos1.txt
        try (PrintWriter writer = new PrintWriter("datos1.txt")) {
            writer.println("DATOS 1 - ARCHIVO DE EJEMPLO");
            writer.println();
            writer.println("Este archivo demuestra try-with-resources.");
            writer.println("El cierre es automático y garantizado.");
            System.out.println("Archivo 'datos1.txt' creado");
        } catch (IOException e) {
            System.out.println("No se pudo crear datos1.txt");
        }
        
        // Crear datos2.txt
        try (PrintWriter writer = new PrintWriter("datos2.txt")) {
            writer.println("DATOS 2 - ARCHIVO DE EJEMPLO");
            writer.println();
            writer.println("TP8 - Programación II");
            writer.println("Universidad Tecnológica Nacional");
            writer.println("Interfaces y Excepciones en Java");
            System.out.println("Archivo 'datos2.txt' creado");
        } catch (IOException e) {
            System.out.println("No se pudo crear datos2.txt");
        }
        
        System.out.println();
    }
    
}
