package tp06.Ejercicio01;

public class MainEjercicio01 {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // TAREA 1
        System.out.println("\nTAREA 1: Creando productos");
        Producto p1 = new Producto("P001", "Arroz 1kg", 850.50, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 250000.00, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 2500.00, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Luz LED", 1800.00, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Aceite de Oliva 500ml", 1200.00, 80, CategoriaProducto.ALIMENTOS);
        
        // Agregar productos
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // TAREA 2
        System.out.println("\nTAREA 2: Listando todos los productos");
        inventario.listarProductos();

        // TAREA 3
        System.out.println("\nTAREA 3: Buscando producto por ID ");
        String idBuscar = "P002";
        System.out.println("Buscando producto con ID: " + idBuscar);
        Producto encontrado = inventario.buscarProductoPorId(idBuscar);
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // TAREA 4
        System.out.println("\nTAREA 4: Filtrando por categoría");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // TAREA 5
        System.out.println("\nTAREA 5: Eliminando producto");
        inventario.eliminarProducto("P003");
        System.out.println("\nListado después de eliminar:");
        inventario.listarProductos();

        // TAREA 6
        System.out.println("\nTAREA 6: Actualizando stock");
        inventario.actualizarStock("P001", 150);

        // TAREA 7
        System.out.println("\nTAREA 7: Total de stock");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades en stock: " + totalStock);

        // TAREA 8
        System.out.println("\nTAREA 8: Producto con mayor stock");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }

        // TAREA 9
        System.out.println("\nTAREA 9: Filtrando por rango de precio");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // TAREA 10
        System.out.println("\nTAREA 10: Categorías disponibles");
        inventario.mostrarCategoriasDisponibles();

    }
}



