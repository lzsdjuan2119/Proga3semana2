package semana2;

import javax.swing.JOptionPane;

public class Ejercicio1 {
 public static void main(String[] args) {
     double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
     double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
     
     Triangulo triangulo = new Triangulo();
     double area = triangulo.calcularArea(base, altura);
     
     JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
 }
}
