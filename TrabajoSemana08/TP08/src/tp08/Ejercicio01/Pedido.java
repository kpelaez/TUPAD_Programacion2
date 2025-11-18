package tp08.Ejercicio01;
import java.util.ArrayList;

public class Pedido implements Pagable {
    // Atributos privados
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private String estado;
    private Notificable cliente; // Referencia al cliente
    
    // Contador estático
    private static int contadorPedidos = 1000;
    
    public Pedido() {
        this.numeroPedido = ++contadorPedidos;
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = null;
    }
    
    public Pedido(Notificable cliente) {
        this.numeroPedido = ++contadorPedidos;
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }
    
    // Getters y Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;

        if (this.cliente != null) {
            String mensaje = String.format(
                "Su pedido #%d ha cambiado a estado: %s", 
                this.numeroPedido, 
                nuevoEstado
            );
            this.cliente.recibirNotificacion(mensaje);
        }
    }
    
    public void setCliente(Notificable cliente) {
        this.cliente = cliente;
    }
    

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public boolean eliminarProducto(Producto producto) {
        return this.productos.remove(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public void mostrarDetalle() {
        System.out.println("DETALLE DEL PEDIDO #" + numeroPedido);
        System.out.println("Estado: " + estado);
        System.out.println("\nProductos:");
        
        if (productos.isEmpty()) {
            System.out.println("(Sin productos)");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.printf("  %d. %s\n", i + 1, productos.get(i));
            }
        }
        
        System.out.printf("TOTAL: $%.2f\n", calcularTotal());
    }

    @Override
    public String toString() {
        return String.format("Pedido #%d - Estado: %s - Total: $%.2f", 
            numeroPedido, estado, calcularTotal());
    }
}