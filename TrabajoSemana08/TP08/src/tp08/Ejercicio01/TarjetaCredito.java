package tp08.Ejercicio01;

public class TarjetaCredito implements PagoConDescuento {
    // Atributos privados
    private String numeroTarjeta;
    private String titular;
    private String fechaVencimiento;
    private double limiteCredito;
    private double saldoDisponible;
    
    public TarjetaCredito(String numeroTarjeta, String titular, String fechaVencimiento, double limiteCredito) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.limiteCredito = limiteCredito;
        this.saldoDisponible = limiteCredito;
    }
    
    // Getters y Setters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("\nProcesando pago con Tarjeta de Crédito...");
        System.out.println("Tarjeta: **** **** **** " + numeroTarjeta);
        System.out.println("Titular: " + titular);
        System.out.printf("Monto: $%.2f\n", monto);
        
        if (monto <= saldoDisponible) {
            saldoDisponible -= monto;
            System.out.println("PAGO APROBADO");
            System.out.printf("Saldo disponible restante: $%.2f\n", saldoDisponible);
            return true;
        } else {
            System.out.println("PAGO RECHAZADO - Saldo insuficiente");
            System.out.printf("Saldo disponible: $%.2f\n", saldoDisponible);
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
        System.out.printf("Descuento aplicado: %.0f%% en pagos con Tarjeta de Crédito\n", porcentaje);
        return descuento;
    }

    public boolean procesarPagoConDescuento(double monto, double porcentajeDescuento) {
        double factorDescuento = aplicarDescuento(porcentajeDescuento);
        double montoFinal = monto * (1 - factorDescuento);
        System.out.printf("   Monto original: $%.2f\n", monto);
        System.out.printf("   Monto con descuento: $%.2f\n", montoFinal);
        return procesarPago(montoFinal);
    }
    

    @Override
    public String toString() {
        return String.format("Tarjeta de Crédito **** %s - Titular: %s - Disponible: $%.2f", 
            numeroTarjeta, titular, saldoDisponible);
    }
}