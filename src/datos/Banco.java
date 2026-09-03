package datos;

public class Banco {
	public double monto;
	public double ganancia;
	public double calcularGanancia() {
     ganancia = monto * 0.02; 
     return ganancia;
 }
}