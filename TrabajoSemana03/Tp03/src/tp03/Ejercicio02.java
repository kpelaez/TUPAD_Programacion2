package tp03;

class Mascota {
    public String nombre;
    public String especie;
    public int edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad);
    }
}


public class Ejercicio02 {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Lucky", "Perro", 10);
        
        mascota.mostrarInfo();
               
        // Simular el paso del tiempo
        System.out.println("--- Simulando el paso del tiempo ---");
        mascota.cumplirAnios();
        System.out.println("--- Simulando el paso del tiempo ---");
        mascota.cumplirAnios();
        
        System.out.println();

        mascota.mostrarInfo();
    }
}
