package datos;

public class Triangulo {
    public double base;
    public double altura;
    public double area;

    public double calcular_area() {
        area = (base * altura) / 2;
        return area; 
    }
}