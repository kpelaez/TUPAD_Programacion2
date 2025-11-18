package tp07.Ejercicio03;
import java.util.ArrayList;

public class mainEjercicio03 {
    public static void main(String[] args) {

        // Creación de empleados individuales
        System.out.println("1. Creando empleados individuales:\n");
        
        EmpleadoPlanta empleadoPlanta1 = new EmpleadoPlanta("Juan", "Pérez", 12345678, 150000.0, 5);
        System.out.println("Empleado de Planta:");
        empleadoPlanta1.mostrarInfo();
                
        EmpleadoTemporal empleadoTemporal1 = new EmpleadoTemporal("María", "González", 87654321, 1500.0, 160);
        System.out.println("Empleado Temporal:");
        empleadoTemporal1.mostrarInfo();
                
        System.out.println("2. Creando lista polimórfica de empleados:\n");
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Agregando empleados
        empleados.add(new EmpleadoPlanta("Carlos", "López", 11111111, 180000.0, 10));
        empleados.add(new EmpleadoTemporal("Ana", "Martínez", 22222222, 1800.0, 120));
        empleados.add(new EmpleadoPlanta("Laura", "Rodríguez", 33333333, 160000.0, 3));
        empleados.add(new EmpleadoTemporal("Pedro", "Sánchez", 44444444, 2000.0, 180));
        empleados.add(new EmpleadoPlanta("Sofía", "Fernández", 55555555, 200000.0, 15));
        empleados.add(new EmpleadoTemporal("Diego", "García", 66666666, 1600.0, 140));
        
        System.out.println("Se agregaron " + empleados.size() + " empleados a la lista.\n");
        
        System.out.println("3. Invocación de calcularSueldo():\n");
        
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            empleados.get(i).mostrarInfo();
            System.out.println();
        }
                
        // instanceof para clasificar empleados
        System.out.println("4. Clasificación usando instanceof:\n");
        
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        double sumaPlanta = 0;
        double sumaTemporal = 0;
        
        ArrayList<EmpleadoPlanta> empleadosPlanta = new ArrayList<>();
        ArrayList<EmpleadoTemporal> empleadosTemporales = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                sumaPlanta += empleado.calcularSueldo();
                empleadosPlanta.add((EmpleadoPlanta) empleado); // Downcasting
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                sumaTemporal += empleado.calcularSueldo();
                empleadosTemporales.add((EmpleadoTemporal) empleado); // Downcasting
            }
        }
        
        System.out.println("Resumen por tipo de empleado:");
        System.out.println("Cantidad: " + contadorPlanta);
        System.out.println("Masa salarial total: $" + String.format("%.2f", sumaPlanta));
        System.out.println("Sueldo promedio: $" + String.format("%.2f", sumaPlanta / contadorPlanta));
        
 
        System.out.println("EMPLEADOS TEMPORALES");

        System.out.println("Cantidad: " + contadorTemporal);
        System.out.println("Masa salarial total: $" + String.format("%.2f", sumaTemporal));
        System.out.println("Sueldo promedio: $" + String.format("%.2f", sumaTemporal / contadorTemporal));
        
      
        System.out.println("TOTALES GENERALES");

        System.out.println("Total empleados: " + empleados.size());
        System.out.println("Masa salarial total: $" + String.format("%.2f", sumaPlanta + sumaTemporal));
        System.out.println("Sueldo promedio general: $" + String.format("%.2f", (sumaPlanta + sumaTemporal) / empleados.size()));
                
        // Búsqueda empleado con mayor sueldo
        System.out.println("5. Empleado con mayor sueldo:\n");
        
        Empleado empleadoMayorSueldo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.calcularSueldo() > empleadoMayorSueldo.calcularSueldo()) {
                empleadoMayorSueldo = empleado;
            }
        }
        
        System.out.println("El empleado con mayor sueldo es:");
        empleadoMayorSueldo.mostrarInfo();
        
        // downcasting con instanceof
        System.out.println("6. Información específica:\n");
        
        System.out.println("Detalles de empleados de planta:");
        for (EmpleadoPlanta emp : empleadosPlanta) {
            System.out.println(emp.getNombre() + " " + emp.getApellido() + " - Antigüedad: " + emp.getAntiguedad() + " años");
        }
        
        System.out.println("\nDetalles de empleados temporales:");
        for (EmpleadoTemporal emp : empleadosTemporales) {
            System.out.println(emp.getNombre() + " " + emp.getApellido() +" - Horas trabajadas: " + emp.getHorasTrabajadas());
        }
        
    }
}