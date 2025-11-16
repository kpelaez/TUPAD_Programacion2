package tp05.ejercicio08;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición: la firma es parte del documento

    public Documento(String titulo, String contenido, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        // el documento crea y controla la firma digital
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }  
}
