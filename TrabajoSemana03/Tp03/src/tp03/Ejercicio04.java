package tp03;

class Gallina {
    
    public int idGallina;
    public int edad;
    public int huevosPuestos;
    
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina :" + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}

public class Ejercicio04 {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);
        
        System.out.println("Estado inicial");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println();
        System.out.println("Simulando acciones");
        
        // Gallina 1: poner huevos y envejecer
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        System.out.println();
        
        // Gallina 2: envejecer y poner huevos
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
        System.out.println();
        System.out.println("Estado final");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }   
}
