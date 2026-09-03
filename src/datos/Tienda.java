package datos;
public class Tienda {
	private String cliente;
	private String producto;
	private double prec_unit;
	private int cantidad;
	private double importe;
	private double dscto;
	public double igv =0.18;
	private double neto;
	private double TASA_DSCTO = 0.15;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getPrec_unit() {
		return prec_unit;
	}
	public void setPrec_unit(double prec_unit) {
		this.prec_unit = prec_unit;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getDscto() {
		return dscto;
	}
	public void setDscto(double dscto) {
		this.dscto = dscto;
	}
	public double getNeto() {
		return neto;
	}
	public void setNeto(double neto) {
		this.neto = neto;
	}
	public double getTASA_DSCTO() {
		return TASA_DSCTO;
	}
	public void setTASA_DSCTO(double tASA_DSCTO) {
		TASA_DSCTO = tASA_DSCTO;
	}
	// Métodos para calcular todos los valores
	public void calcularTotales() {
		// 1. Calculamos el importe (precio x cantidad)
		this.importe = this.prec_unit * this.cantidad;

		// 2. Calculamos el descuento (15% del importe)
		this.dscto = this.importe * this.TASA_DSCTO;

		// 3. Calculamos un subtotal (importe menos descuento)
		double subtotal = this.importe - this.dscto;

		// 4. Calculamos el monto del IGV usando la variable igv
		double montoIgv = subtotal * this.igv;

		// 5. El neto final a pagar es el subtotal más el IGV
		this.neto = subtotal + montoIgv;
	}


}