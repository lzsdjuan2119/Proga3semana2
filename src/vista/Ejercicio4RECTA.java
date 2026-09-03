package vista;
import datos.TrianguloRectangulo;
import javax.swing.JOptionPane;

public class Ejercicio4RECTA {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto b:"));
        
        TrianguloRectangulo triangulo = new TrianguloRectangulo(a, b);
        double hipotenusa = triangulo.calcularHipotenusa();
        
        JOptionPane.showMessageDialog(null, "La hipotenusa es: " + hipotenusa);
    }
}