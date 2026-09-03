package vista;
import datos.Banco;

import javax.swing.JOptionPane;

public class Ejercicio2_banco {
 public static void main(String[] args) {
	 Banco x = new Banco();
     x.monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a ahorrar:"));
     
     x.ganancia = x.calcularGanancia();
     
     JOptionPane.showMessageDialog(null, "La ganancia mensual del 2% será: " + x.ganancia);
 }
}
