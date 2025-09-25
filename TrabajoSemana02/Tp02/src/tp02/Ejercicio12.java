package tp02;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        // a) Declarar e inicializar array con algunos precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b) Mostrar los valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // c) Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99;
        
        // d) Valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
}
