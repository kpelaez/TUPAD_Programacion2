package tp05.ejercicio12;

public class Calculadora {

    /**
     * Método que calcula el impuesto con recargos o descuentos
     * DEPENDENCIA DE USO: recibe Impuesto como parámetro pero no lo almacena
     */
    public void calcular(Impuesto impuesto) {
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        
        // Calcular recargos como ejemplo: 10%
        double recargo = impuesto.getMonto() * 0.10;
        double total = impuesto.getMonto() + recargo;
        
        System.out.println("Recargo del 10%: $" + recargo);
        System.out.println("Total a pagar: $" + total);
    }

}