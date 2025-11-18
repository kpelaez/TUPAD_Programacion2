package tp07.Ejercicio01;


public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
     public Auto(String marca, String modelo, int cantidadPuertas) {
        // Invocación al constructor de la superclase con super()
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Información del Auto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
    
    // Getter y Setter para cantidadPuertas
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas ;
    }
}