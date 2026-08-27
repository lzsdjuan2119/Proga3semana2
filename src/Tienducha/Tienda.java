package Tienducha;
public class Tienda {
    private String sucursal;
    private final double TASA_DSCTO = 0.15;

    public Tienda(String sucursal) {
        this.sucursal = sucursal;
    }

    public double obtenerDscto(double importe) {
        return importe * TASA_DSCTO;
    }

    public double obtenerNeto(double importe) {
        return importe - obtenerDscto(importe);
    }
    
    public String emitirComprobante(String cliente, double importe) {
        double dscto = obtenerDscto(importe);
        double neto = obtenerNeto(importe);
        
        return "--- COMPROBANTE DE PAGO ---\n" +
               "Sucursal: " + sucursal + "\n" +
               "Cliente/Razón Social: " + cliente + "\n" +
               "---------------------------\n" +
               "Importe: S/ " + String.format("%.2f", importe) + "\n" +
               "Dscto (15%): S/ " + String.format("%.2f", dscto) + "\n" +
               "Neto a Pagar: S/ " + String.format("%.2f", neto) + "\n" +
               "---------------------------\n" +
               "Gracias por su preferencia.";
    }
}