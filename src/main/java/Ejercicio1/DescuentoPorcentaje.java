package Ejercicio1;

public class DescuentoPorcentaje implements Descuento {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double precioBase) {
        return precioBase * (porcentaje / 100.0);
    }


}
