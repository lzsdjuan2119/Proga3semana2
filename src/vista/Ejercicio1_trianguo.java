package vista;

import datos.Triangulo;
import javax.swing.JOptionPane; 

public class Ejercicio1_trianguo {

    public static void main(String[] args) {
        // Instanciamos el objeto de la capa de datos
        Triangulo x = new Triangulo();
        
        
        x.base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        
        x.altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));
        
        // Mostramos el resultado en un cuadro de mensaje
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + x.calcular_area());
    }
}