package Triangulocho;

public class TrianguloRectangulo {
    private double catetoA;
    private double catetoB;

    public TrianguloRectangulo(double catetoA, double catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
}