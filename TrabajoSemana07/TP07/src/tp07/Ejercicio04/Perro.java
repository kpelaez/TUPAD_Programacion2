package tp07.Ejercicio04;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        // Invoca al constructor de la superclase
        super(nombre, edad, "Doméstico");
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
    
    @Override
    public String getTipo() {
        return "Perro";
    }

    @Override
    public void describirAnimal() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Raza: " + raza);
        System.out.println("Hábitat: " + habitat);
    }
    
    public void moverCola() {
        System.out.println(nombre + " mueve la cola");
    }
    
    // Getter y Setter
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
}