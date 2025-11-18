package tp07.Ejercicio04;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        // Invoca al constructor de la superclase
        super(nombre, edad, "Doméstico");
        this.color = color;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
   
    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public void describirAnimal() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Color: " + color);
        System.out.println("Hábitat: " + habitat);
    }

    public void ronronear() {
        System.out.println(nombre + "ronronea");
    }
    
    // Getter y Setter
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}