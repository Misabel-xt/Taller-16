package Ejercicio1;

public class DescuentoFijo implements Descuento {

    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularDescuento(double precioBase) {
        // Aseguramos que el descuento no sea mayor que el precio
        return Math.min(montoFijo, precioBase);
    }

}
