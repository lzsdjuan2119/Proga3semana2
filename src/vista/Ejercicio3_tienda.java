package vista;

import datos.Tienda;
import javax.swing.JOptionPane;

public class Ejercicio3_tienda {
    public static void main(String[] args) {
        // Creamos el objeto
        Tienda x = new Tienda();
        x.setCliente(JOptionPane.showInputDialog("Ingrese el nombre del cliente:"));
        x.setProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto:"));
        
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario:"));
        x.setPrec_unit(precio);
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad comprada:"));
        x.setCantidad(cantidad);
        
        x.calcularTotales();
        
        // 3. MOSTRAMOS EL RESULTADO USANDO LOS GETTERS
        // Armamos un texto largo con saltos de línea (\n) para que parezca una boleta
        String boleta = "--- BOLETA DE VENTA ---\n"
                      + "Cliente: " + x.getCliente() + "\n"
                      + "Producto: " + x.getProducto() + "\n"
                      + "Precio Unitario: S/ " + x.getPrec_unit() + "\n"
                      + "Cantidad: " + x.getCantidad() + "\n"
                      + "-----------------------\n"
                      + "Importe Bruto: S/ " + x.getImporte() + "\n"
                      + "Descuento (15%): S/ " + x.getDscto() + "\n"
                      + "IGV (18%): S/ " + ( (x.getImporte() - x.getDscto()) * x.igv ) + "\n"
                      + "-----------------------\n"
                      + "TOTAL A PAGAR: S/ " + x.getNeto();
                      
        // Mostramos la boleta final
        JOptionPane.showMessageDialog(null, boleta);
    }
}