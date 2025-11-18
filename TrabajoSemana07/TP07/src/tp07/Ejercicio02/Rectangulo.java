package tp07.Ejercicio02;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    

    public Rectangulo(double base, double altura) {
        // Invoca al constructor de la superclase
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Base: " + String.format("%.2f", base) + " unidades");
        System.out.println("Altura: " + String.format("%.2f", altura) + " unidades");
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " unidades²");
    }
    
    // Getters y Setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}