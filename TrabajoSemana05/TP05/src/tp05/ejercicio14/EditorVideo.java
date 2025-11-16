package tp05.ejercicio14;

public class EditorVideo {

    /**
     * Método que exporta un proyecto de video
     * DEPENDENCIA DE CREACIÓN: crea un objeto Render pero no lo almacena
     */
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato: " + formato);
        
        // Dependencia de creacion
        Render render = new Render(formato, proyecto);
        
        System.out.println("Video exportado exitosamente");
        
        // Retorna el render pero no lo guarda como atributo de la clase
        return render;
    }

}



