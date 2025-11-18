package tp07.Ejercicio04;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String habitat;

    public Animal(String nombre, int edad, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }

    public void describirAnimal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Hábitat: " + habitat);
    }
    
    public String getTipo() {
        return "Animal genérico";
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}