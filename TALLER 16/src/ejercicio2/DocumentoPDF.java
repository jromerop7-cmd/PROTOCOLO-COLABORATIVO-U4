package ejercicio2;

public class DocumentoPDF {
    private String contenido;

    public DocumentoPDF(String contenido) {
        this.contenido = contenido;
    }

    public void exportarComoPDF() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

