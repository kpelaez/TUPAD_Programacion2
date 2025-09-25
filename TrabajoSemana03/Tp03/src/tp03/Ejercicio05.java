package tp03;

class NaveEspacial {
    public String nombre;
    public double combustible;
    private final double COMBUSTIBLE_MAXIMO = 80.0;
    private final double CONSUMO_POR_DISTANCIA = 1.0;
    
    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, COMBUSTIBLE_MAXIMO);
    }
    
    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave ha despegado correctamente");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * CONSUMO_POR_DISTANCIA;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " unidades.");
            System.out.println("Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar ");
            System.out.println("Combustible actual: " + combustible + " | Necesario: " + combustibleNecesario);
        }
    }

    public void recargarCombustible(double cantidad) {
        double combustibleAnterior = combustible;
        combustible = Math.min(combustible + cantidad, COMBUSTIBLE_MAXIMO);
        
        if (combustibleAnterior + cantidad > COMBUSTIBLE_MAXIMO) {
            System.out.println("Advertencia: Se alcanzó el límite máximo de combustible (" + COMBUSTIBLE_MAXIMO + ")");
        }
        
        System.out.println("Combustible recargado. Nivel actual: " + combustible);
    }
    
    public void mostrarEstado() {
        System.out.println("ESTADO DE LA NAVE -->" + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
        System.out.println("Estado: " + (combustible > 0 ? "Operativa" : "Sin combustible"));
    }
}

public class Ejercicio05 {
    public static void main(String[] args) {
    // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Tony2", 50);
        
        nave.mostrarEstado();
        nave.despegar();
        
        System.out.println();
        System.out.println("Avanzar sin recargar combustible 60 unidades");
        nave.avanzar(60); // Intentar avanzar más de lo que permite el combustible
        
        System.out.println();
        System.out.println("Recargando combustible");
        nave.recargarCombustible(40);
        
        System.out.println();
        System.out.println("Avanzando correctamente 30 unidades");
        nave.avanzar(30); // Ahora sí puede avanzar
        System.out.println("Avanzando correctamente 25 unidades");
        nave.avanzar(25); // Avanzar más
        
        System.out.println();
        System.out.println("Intentando sobrecargar combustible");
        nave.recargarCombustible(70); // Intentar superar el límite
        
        System.out.println();
        System.out.println("Estado final");
        nave.mostrarEstado();
    }
}
