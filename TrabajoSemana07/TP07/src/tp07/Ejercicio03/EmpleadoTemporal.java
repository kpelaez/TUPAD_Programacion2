package tp07.Ejercicio03;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, String apellido, int dni,
                           double tarifaPorHora, int horasTrabajadas) {
        super(nombre, apellido, dni);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
    
    @Override
    public String getTipoEmpleado() {
        return "Empleado Temporal";
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: " + getTipoEmpleado());
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Tarifa por hora: $" + String.format("%.2f", tarifaPorHora));
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Sueldo total: $" + String.format("%.2f", calcularSueldo()));
    }
    
    // Getters y Setters
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}