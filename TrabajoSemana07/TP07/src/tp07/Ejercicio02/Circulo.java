package tp07.Ejercicio02;

public class Circulo extends Figura {
    private double radio;
    

    public Circulo(double radio) {
        // Invoca al constructor de la superclase
        super("Círculo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Radio: " + String.format("%.2f", radio) + " unidades");
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " unidades²");
    }
    
    // Getter y Setter
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
}