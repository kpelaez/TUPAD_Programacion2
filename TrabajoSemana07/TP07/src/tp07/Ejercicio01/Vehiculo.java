package tp07.Ejercicio01;


public class Vehiculo {
    // Atributos protegidos para acceder desde subclases
    protected String marca;
    protected String modelo;
    
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
   
    public void mostrarInfo() {
        System.out.println("Información del Vehículo");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}