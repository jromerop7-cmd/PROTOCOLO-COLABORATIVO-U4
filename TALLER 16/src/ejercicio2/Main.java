package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Documento docPDF = new Documento("Informe mensual", new ExportadorPDF());
        docPDF.exportar();

        Documento docWord = new Documento("Acta de reunión", new ExportadorWord());
        docWord.exportar();

        Documento docExcel = new Documento("Reporte financiero", new ExportadorExcel());
        docExcel.exportar();
    }
}

