package tp04;

class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    private static int proximoId = 1;
    
     
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        
        // Actualizar proximoId
        if (id >= proximoId) {
            proximoId = id + 1;
        }
    }
    
    // Constructor con solo nombre y puesto, id y salario
    public Empleado(String nombre, String puesto) {
        this.id = proximoId++; // Asignar ID  y aumentar contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; // Salario por defecto
        totalEmpleados++; 
    }
        
    // Método con porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        System.out.println("Salario actualizado en " + porcentaje + "% de aumento.");
        System.out.println("Nuevo salario: $" + String.format("%.2f", this.salario));
    }
    
    // Método con cantidad fija a aumentar
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
        System.out.println("Salario actualizado con aumento fijo de $" + cantidadFija);
        System.out.println("Nuevo salario: $" + String.format("%.2f", this.salario));
    }
    
    @Override
    public String toString() {
        return "Empleado{" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Puesto='" + puesto + '\'' +
               ", Salario=$" + String.format("%.2f", salario) +
               '}';
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Método adicional para obtener información completa
    public static String obtenerEstadisticas() {
        return "Total de empleados creados: " + totalEmpleados;
    }
    
  
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("El ID debe ser un número positivo.");
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        } else {
            System.out.println("El puesto no puede estar vacío.");
        }
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
}

public class SistemaGestionEmpleados {
    
    public static void main(String[] args) {
        System.out.println("\t\tSISTEMA DE GESTIÓN DE EMPLEADOS ");
       

        System.out.println("\tCREANDO EMPLEADOS CON DIFERENTES CONSTRUCTORES");
        
        // Usando constructor completo
        Empleado emp1 = new Empleado(101, "Ana Garcia", "Desarrolladora", 75000.0);
        System.out.println("Empleado creado con constructor completo:");
        System.out.println(emp1.toString());
        System.out.println();
        
        // Usando constructor simplificado
        Empleado emp2 = new Empleado("Carlos Lopez", "Analista de Sistemas");
        System.out.println("Empleado creado con constructor simplificado:");
        System.out.println(emp2.toString());
        System.out.println();
        
        // Otros empleados
        Empleado emp3 = new Empleado("Maria Rodriguez", "Gerente de Proyecto");
        Empleado emp4 = new Empleado(205, "Juan Perez", "Tester QA", 60000.0);
        
        // Mostrar total de empleados
        System.out.println("¡ESTADISTICAS ACTUALES!");
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        System.out.println(Empleado.obtenerEstadisticas());
        System.out.println();
        

        System.out.println("Aumentos de Salarios");
        
        // Aumento por porcentaje
        System.out.println("Aplicando 15% de aumento a " + emp1.getNombre() + ":");
        emp1.actualizarSalario(15.0);
        System.out.println();
        
        // Aumento fijo
        System.out.println("Aplicando aumento fijo de $8000 a " + emp2.getNombre() + ":");
        emp2.actualizarSalario(8000);
        System.out.println();
        
        
        
        System.out.println("Información de empleados (hasta ahora)");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println();
       
        
        System.out.println("Creando más empleados--->");
        
        Empleado emp5 = new Empleado("Laura Martinez", "Diseniadora UX");
        Empleado emp6 = new Empleado(300, "Roberto Silva", "DevOps Engineer", 80000.0);
        
        System.out.println(emp5.toString());
        System.out.println(emp6.toString());
        System.out.println();
        

        System.out.println("\t\tESTADISTICAS FINALES");
        System.out.println(Empleado.obtenerEstadisticas());
        System.out.println("Total final de empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
}

