package banquito;

import javax.swing.JOptionPane;

public class Ejercicio2 {
 public static void main(String[] args) {
     double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a ahorrar:"));
     
     Banco banco = new Banco();
     double ganancia = banco.calcularGanancia(monto);
     
     JOptionPane.showMessageDialog(null, "La ganancia mensual del 2% será: " + ganancia);
 }
}
