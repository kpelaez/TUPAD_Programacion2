package tp05.ejercicio11;

public class Reproductor {

    /**
     * Método que reproduce una canción
     * DEPENDENCIA DE USO: recibe Cancion como parámetro
     */
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        System.out.println("  Artista: " + cancion.getArtista().getNombre());
        System.out.println("  Género: " + cancion.getArtista().getGenero());
    }

    public void pausar() {
        System.out.println("Reproducción pausada");
    }

    public void detener() {
        System.out.println("Reproducción detenida");
    }
}



