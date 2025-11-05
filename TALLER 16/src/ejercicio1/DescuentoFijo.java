package ejercicio1;

public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        super(0);
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        double precioConDescuento = precioOriginal - montoFijo;
        if (precioConDescuento < 0) {
            precioConDescuento = 0;
        }
        return precioConDescuento;
    }
}

