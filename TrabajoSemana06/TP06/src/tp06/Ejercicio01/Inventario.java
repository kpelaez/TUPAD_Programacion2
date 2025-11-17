package tp06.Ejercicio01;
import java.util.ArrayList;

public class Inventario {
   
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    public void listarProductos() {        
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Total de productos: " + productos.size());
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto eliminado: " + productoAEliminar.getNombre());
            return true;
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
            return false;
        }
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        
        if (producto != null) {
            int cantidadAnterior = producto.getCantidad();
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado de '" + producto.getNombre() + "'");
            System.out.println("Cantidad anterior: " + cantidadAnterior + "Nueva cantidad: " + nuevaCantidad);
            return true;
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
            return false;
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        
        boolean encontrado = false;
        
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay productos en la categoría: " + categoria);
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto productoConMayorStock = productos.get(0);
        
        for (Producto p : productos) {
            if (p.getCantidad() > productoConMayorStock.getCantidad()) {
                productoConMayorStock = p;
            }
        }
        
        return productoConMayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        
        boolean encontrado = false;
        
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precio.");
        }
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println(" CATEGORÍAS DISPONIBLES");
        
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("• " + categoria + ": " + categoria.getDescripcion());
        }
    }
}



