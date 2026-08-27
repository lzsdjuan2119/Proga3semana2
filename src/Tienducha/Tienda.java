package Tienducha;
public class Tienda {
    public double calcularMontoAPagar(double montoTotal) {
        double descuento = montoTotal * 0.15;
        return montoTotal - descuento;
    }
}