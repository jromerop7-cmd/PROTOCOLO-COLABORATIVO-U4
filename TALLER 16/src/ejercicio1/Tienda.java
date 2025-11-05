package ejercicio1;

public class Tienda {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(20);
        Descuento descuentoFijo = new DescuentoFijo(15);

        double precio = 100;

        System.out.println("Precio con 20%: $" + descuentoPorcentaje.aplicarDescuento(precio));
        System.out.println("Precio con $15: $" + descuentoFijo.aplicarDescuento(precio));
    }
}

