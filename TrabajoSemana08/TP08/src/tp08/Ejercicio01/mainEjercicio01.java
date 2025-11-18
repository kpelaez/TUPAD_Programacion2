/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp08.Ejercicio01;

public class mainEjercicio01 {
    public static void main(String[] args) {
        // 1. CREAR CLIENTE
       System.out.println("1. CREACIÓN DE CLIENTE");
        Cliente cliente1 = new Cliente("María González", "maria.gonzalez@email.com");
        System.out.println(cliente1 + "\n");
        
        // 2. CREAR PRODUCTOS 
        System.out.println("2. CATÁLOGO DE PRODUCTOS");
        Producto p1 = new Producto("Notebook HP", 85000.00);
        Producto p2 = new Producto("Mouse Logitech", 5500.00);
        Producto p3 = new Producto("Teclado Mecánico", 12000.00);
        Producto p4 = new Producto("Monitor 24 pulgadas", 45000.00);
        
        System.out.println("Productos disponibles:");
        System.out.println("1. " + p1);
        System.out.println("2. " + p2);
        System.out.println("3. " + p3);
        System.out.println("4. " + p4);
        System.out.println();
        
        // 3. CREAR PEDIDO
     
        System.out.println("3. CREACIÓN DE PEDIDO");
        Pedido pedido1 = new Pedido(cliente1); // Cliente recibirá notificaciones
        
        System.out.println("\nAgregando productos al pedido...");
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p3);
        
        pedido1.mostrarDetalle();
        
        // 4. DEMOSTRACIÓN DE POLIMORFISMO PAGABLE
        System.out.println("4.INTERFAZ PAGABLE");
        System.out.println("Demostrando que tanto Producto como Pedido implementan Pagable:\n");
        
        Pagable[] elementosPagables = {p1, p2, pedido1};
        
        for (int i = 0; i < elementosPagables.length; i++) {
            System.out.printf("Elemento %d: %s\n", i + 1, elementosPagables[i].getClass().getSimpleName());
            System.out.printf("Total calculado: $%.2f\n\n", elementosPagables[i].calcularTotal());
        }
        
        // 5. CAMBIOS DE ESTADO DEL PEDIDO
        System.out.println("5. CAMBIOS DE ESTADO Y NOTIFICACIONES");
        System.out.println("El cliente recibirá notificaciones automáticas:\n");
        
        pedido1.setEstado("EN PROCESO");
               
        pedido1.setEstado("ENVIADO");
        
        // 6. MÉTODOS DE PAGO 
        System.out.println("\n6. MÉTODOS DE PAGO");
        
        // Crear métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito(
            "4532", 
            "María González", 
            "12/26", 
            150000.00
        );
        
        PayPal paypal = new PayPal(
            "maria.gonzalez@email.com", 
            "María González", 
            80000.00
        );
        
        System.out.println("\nMétodos de pago disponibles:");
        System.out.println("1. " + tarjeta);
        System.out.println("2. " + paypal);
        System.out.println();
        
        // 7. PROCESAR PAGO SIN DESCUENTO
        System.out.println("7. PAGO CON TARJETA DE CRÉDITO (SIN DESCUENTO)");
        double totalPedido = pedido1.calcularTotal();
        System.out.printf("Total del pedido: $%.2f\n", totalPedido);
        
        boolean pagoExitoso = tarjeta.procesarPago(totalPedido);
        
        if (pagoExitoso) {
            pedido1.setEstado("PAGADO");
        }
        
        // 8. CREAR SEGUNDO PEDIDO CON DESCUENTO
        System.out.println("\n8. PEDIDO CON DESCUENTO");
        
        // Crear nuevo cliente
        Cliente cliente2 = new Cliente("Juan Pérez", "juan.perez@email.com");
        System.out.println(cliente2);
        
        // Crear nuevo pedido
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(p4); // Monitor
        pedido2.agregarProducto(p2); // Mouse
        
        pedido2.mostrarDetalle();
        
        // 9. PAGO USANDO PAYPAL
        System.out.println("9. PAGO CON PAYPAL");
        double totalPedido2 = pedido2.calcularTotal();
        System.out.printf("Total del pedido: $%.2f\n", totalPedido2);
        
        // Aplicar 15% de descuento
        boolean pagoConDescuento = paypal.procesarPagoConDescuento(totalPedido2, 15.0);
        
        if (pagoConDescuento) {
            pedido2.setEstado("PAGADO");
            pedido2.setEstado("ENVIADO");
            pedido2.setEstado("ENTREGADO");
        } else {
            // Reintentar el pago
            System.out.println("\nReintentando el pago...");
            if (paypal.procesarPagoConDescuento(totalPedido2, 15.0)) {
                pedido2.setEstado("PAGADO");
            }
        }
    }
}