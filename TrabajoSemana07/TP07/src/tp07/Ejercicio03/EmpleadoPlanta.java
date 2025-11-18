package tp07.Ejercicio03;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private int antiguedad;
    private static final double PORCENTAJE_ANTIGUEDAD = 0.02; // 2% por año
    
    public EmpleadoPlanta(String nombre, String apellido, int dni, 
                          double sueldoBasico, int antiguedad) {
        super(nombre, apellido, dni);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }
    

    @Override
    public double calcularSueldo() {
        double adicionalAntiguedad = sueldoBasico * antiguedad * PORCENTAJE_ANTIGUEDAD;
        return sueldoBasico + adicionalAntiguedad;
    }
    
    @Override
    public String getTipoEmpleado() {
        return "Empleado de Planta";
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: " + getTipoEmpleado());
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo básico: $" + String.format("%.2f", sueldoBasico));
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Adicional por antigüedad: $" + 
                         String.format("%.2f", sueldoBasico * antiguedad * PORCENTAJE_ANTIGUEDAD));
        System.out.println("Sueldo total: $" + String.format("%.2f", calcularSueldo()));
    }
    
    // Getters y Setters
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
    
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}