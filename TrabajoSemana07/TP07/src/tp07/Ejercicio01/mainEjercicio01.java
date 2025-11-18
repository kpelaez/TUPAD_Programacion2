package tp07.Ejercicio01;

public class mainEjercicio01 {
    public static void main(String[] args) {

        // Creación de un objeto Vehiculo 
        System.out.println("1. Creando un Vehículo genérico:");
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla");
        vehiculo1.mostrarInfo();
        
        
        // Creación de un objeto Auto
        System.out.println("2. Creando un Auto:");
        Auto auto1 = new Auto("Ford", "Mustang", 2);
        auto1.mostrarInfo();
        
        
        // UPCASTING
        System.out.println("3.UPCASTING:");
        Vehiculo vehiculo2 = new Auto("Chevrolet", "Camaro", 2); // Upcasting 
        vehiculo2.mostrarInfo();
        
        // INSTANCEOF
        System.out.println("4. Demostración de INSTANCEOF:");
        if (vehiculo2 instanceof Auto) {
            System.out.println("vehiculo2 es una instancia de Auto");
            
            // Demostración de DOWNCASTING
            System.out.println("\n5. Demostración de DOWNCASTING:");
            Auto auto2 = (Auto) vehiculo2; // Downcasting
            System.out.println("Cantidad de puertas: " + auto2.getCantidadPuertas());
        }
        
        System.out.println("6.Polimorfismo con array de Vehículos:");
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("Honda", "Civic");
        vehiculos[1] = new Auto("Volkswagen", "Golf", 4);
        vehiculos[2] = new Auto("BMW", "Serie 3", 4);
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nVehículo " + (i + 1) + ":");
            vehiculos[i].mostrarInfo();
            
            // Verificación de tipo con instanceof
            if (vehiculos[i] instanceof Auto) {
                System.out.println("Es un Auto");
            } else {
                System.out.println("Es un Vehículo genérico");
            }
        }
        
    }
}