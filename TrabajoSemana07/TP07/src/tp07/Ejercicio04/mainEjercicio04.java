package tp07.Ejercicio04;
import java.util.ArrayList;

public class mainEjercicio04 {
    public static void main(String[] args) {
      // Creación de animales individuales
        System.out.println("1. Creando animales individuales:\n");
        
        Perro perro1 = new Perro("Max", 3, "Labrador");
        System.out.println("Perro creado:");
        perro1.describirAnimal();
        System.out.print("Sonido: ");
        perro1.hacerSonido();
        perro1.moverCola();
        
        Gato gato1 = new Gato("Luna", 2, "Blanco");
        System.out.println("Gato creado:");
        gato1.describirAnimal();
        System.out.print("Sonido: ");
        gato1.hacerSonido();
        gato1.ronronear();
                
        Vaca vaca1 = new Vaca("Margarita", 5,"campo");
        System.out.println("Vaca creada:");
        vaca1.describirAnimal();
        System.out.print("Sonido: ");
        vaca1.hacerSonido();
                
        // Creación de una lista polimórfica
        System.out.println("\n2. Creando lista de animales:\n");
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Rocky", 5, "Pastor Alemán"));
        animales.add(new Gato("Michi", 3, "Naranja"));
        animales.add(new Vaca("Lola", 4, "campo"));
        animales.add(new Gato("Pelusa", 1, "Gris"));
        animales.add(new Perro("Bruno", 4, "Bulldog"));
        animales.add(new Gato("Whiskers", 4, "Negro"));
        
        System.out.println("Se agregaron " + animales.size() + " animales a la lista.\n");
                
        // Mostrar sonidos 
        System.out.println("3. Sinfonía Animal:\n");
        System.out.println("¡Los sonidos de todos los animales!\n");
        
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            System.out.print((i + 1) + ". " + animal.getNombre() + " (" + animal.getTipo() + "): ");
            animal.hacerSonido(); 
        }
        
        
        // Mostrar descripción completa de cada animal
        System.out.println("\n\n4. Información detallada de cada animal:\n");
        
        for (Animal animal : animales) {
            animal.describirAnimal(); // Llamada polimórfica
            System.out.print("Sonido característico: ");
            animal.hacerSonido(); // Llamada polimórfica
            System.out.println();
        }
        
                
    }
}