package tp08.Ejercicio01;

public class PayPal implements PagoConDescuento {
    // Atributos privados
    private String email;
    private String nombreCuenta;
    private double saldoCuenta;
    
    public PayPal(String email, String nombreCuenta, double saldoInicial) {
        this.email = email;
        this.nombreCuenta = nombreCuenta;
        this.saldoCuenta = saldoInicial;
    }
    
    // Getters y Setters
    public String getEmail() {
        return email;
    }
    
    public String getNombreCuenta() {
        return nombreCuenta;
    }
    
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    
    public void agregarSaldo(double monto) {
        if (monto > 0) {
            this.saldoCuenta += monto;
            System.out.printf("Saldo agregado: $%.2f - Nuevo saldo: $%.2f\n", 
                            monto, saldoCuenta);
        }
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("\nProcesando pago con PayPal...");
        System.out.println("Cuenta: " + email);
        System.out.println("Titular: " + nombreCuenta);
        System.out.printf("Monto: $%.2f\n", monto);
        
        if (monto <= saldoCuenta) {
            saldoCuenta -= monto;
            System.out.println("PAGO APROBADO");
            System.out.printf("Saldo restante: $%.2f\n", saldoCuenta);
            return true;
        } else {
            System.out.println("PAGO RECHAZADO - Saldo insuficiente");
            System.out.printf("Saldo disponible: $%.2f\n", saldoCuenta);
            System.out.printf("Monto faltante: $%.2f\n", monto - saldoCuenta);
            return false;
        }
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento inválido. Debe estar entre 0 y 100.");
            return 0;
        }
        
        double descuento = porcentaje / 100.0;
        System.out.printf("Descuento PayPal aplicado: %.0f%%\n", porcentaje);
        return descuento;
    }
    
    public boolean procesarPagoConDescuento(double monto, double porcentajeDescuento) {
        double factorDescuento = aplicarDescuento(porcentajeDescuento);
        double montoFinal = monto * (1 - factorDescuento);
        System.out.printf("Monto original: $%.2f\n", monto);
        System.out.printf("Monto con descuento: $%.2f\n", montoFinal);
        return procesarPago(montoFinal);
    }
    
    @Override
    public String toString() {
        return String.format("PayPal: %s - Titular: %s - Saldo: $%.2f", 
            email, nombreCuenta, saldoCuenta);
    }
}