package tp05.ejercicio13;

public class GeneradorQR {

    /**
     * Método que genera un código QR
     * DEPENDENCIA DE CREACIÓN: crea un objeto CodigoQR pero no lo almacena
     */
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Valor: " + valor);
        System.out.println("Usuario: " + usuario.getNombre());
        
        // Dependencia de Creacion
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("Código QR generado exitosamente");
        
        // Retorna el código QR
        return codigoQR;
    }
}

