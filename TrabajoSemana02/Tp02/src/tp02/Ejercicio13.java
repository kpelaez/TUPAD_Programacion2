package tp02;

public class Ejercicio13 {

    public static void main(String[] args) {
        // a) Declarar e inicializar array con algunos precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b) Función recursiva para mostrar precios originales
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        
        // c) Modificar el precio de un producto específico
        precios[2] = 129.99;
        
        // d) Función recursiva para mostrar valores modificados
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
    
    // Función recursiva para imprimir array
    static void imprimirArrayRecursivo(double[] array, int indice) {
        // Caso base
        if (indice >= array.length) {
            return;
        }

        System.out.println("Precio: $" + array[indice]);
        
        imprimirArrayRecursivo(array, indice + 1);
    }           
}