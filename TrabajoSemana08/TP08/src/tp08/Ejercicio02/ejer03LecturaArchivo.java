
package tp08.Ejercicio02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejer03LecturaArchivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     
        // Crear archivo de ejemplo si no existe
        crearArchivoEjemplo();
        
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.print("Ingrese el nombre del archivo a leer (o 'salir' para terminar): ");
                String nombreArchivo = teclado.nextLine().trim();
                
                if (nombreArchivo.equalsIgnoreCase("salir")) {
                    continuar = false;
                    continue;
                }

                leerArchivo(nombreArchivo);
                
            } catch (FileNotFoundException e) {
                // Capturar la excepción cuando el archivo no existe
                System.out.println("\nERROR: Archivo no encontrado");
                System.out.println("Detalle: " + e.getMessage());                
            } catch (Exception e) {
                // Capturar cualquier otra excepción
                System.out.println("\nERROR INESPERADO: " + e.getMessage());
                e.printStackTrace();
                System.out.println();
            }
        }
        
        teclado.close();
    }
    
  
    private static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        // Crear objeto File
        File archivo = new File(nombreArchivo);
        
        System.out.println("Archivo encontrado");
        System.out.println("Ruta completa: " + archivo.getAbsolutePath());
        
        Scanner lectorArchivo = new Scanner(archivo);
        
        int numeroLinea = 1;
        while (lectorArchivo.hasNextLine()) {
            String linea = lectorArchivo.nextLine();
            System.out.printf("%3d | %s\n", numeroLinea, linea);
            numeroLinea++;
        }
        
        System.out.println("Archivo leído exitosamente");
        System.out.printf("Total de líneas: %d\n\n", numeroLinea - 1);
        
        lectorArchivo.close();
    }
        
 
    private static void crearArchivoEjemplo() {
        try {
            java.io.PrintWriter writer = new java.io.PrintWriter("ejemplo.txt");
           writer.println("ARCHIVO DE EJEMPLO - TP8 JAVA");
            writer.println();
            writer.println("Este es un archivo de ejemplo para el ejercicio 3.");
            writer.println();
            writer.println("Universidad Tecnológica Nacional");
            writer.println("Programación II - 2025");
            writer.close();
            
            System.out.println("Archivo de ejemplo 'ejemplo.txt' creado exitosamente");
            
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo de ejemplo");
        }
    }
}
