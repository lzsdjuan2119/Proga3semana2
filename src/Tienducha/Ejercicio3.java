package Tienducha;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de los productos:"));
        
        Tienda tienda = new Tienda();
        double totalPagar = tienda.calcularMontoAPagar(monto);
        
        JOptionPane.showMessageDialog(null, "El monto total a pagar (con 15% de descuento) es: " + totalPagar);
    }
}