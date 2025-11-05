package ejercicio1;
public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * porcentaje / 100);
    }
}

