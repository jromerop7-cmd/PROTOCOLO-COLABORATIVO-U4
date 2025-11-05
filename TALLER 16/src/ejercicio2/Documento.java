package ejercicio2;

public class Documento {
    private String contenido;
    private Exportador exportador;

    public Documento(String contenido, Exportador exportador) {
        this.contenido = contenido;
        this.exportador = exportador;
    }

    public void exportar() {
        exportador.exportar(contenido);
    }
}
