package Ejercicio2;

public class ExportarExcel implements ExportarDocumento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento a Excel (.xlsx)...");
    }
}
