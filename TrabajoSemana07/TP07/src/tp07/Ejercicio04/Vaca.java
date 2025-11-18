package tp07.Ejercicio04;

public class Vaca extends Animal {

    public Vaca(String nombre, int edad, String lugar) {
        // Invoca al constructor de la superclase
        super(nombre, edad, "Campo");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuuuuu!");
    }
    
    @Override
    public String getTipo() {
        return "Vaca";
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Hábitat: " + habitat);
    }

}