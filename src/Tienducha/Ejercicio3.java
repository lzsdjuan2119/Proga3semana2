package Tienducha;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tambo Canadá-C8");
        
        String cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre o Razón Social del cliente:");
        double importe = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el importe total (S/):"));
        
        String comprobante = tienda.emitirComprobante(cliente, importe);
        
        JOptionPane.showMessageDialog(null, comprobante, "Punto de Venta", JOptionPane.INFORMATION_MESSAGE);
    }
}