package com;

public class Pago extends PlanTV{
	
	private double precio;
	private String metodo;
	private String cobro;
	
	public Pago() {}

	public Pago(String usuario, String plan, int dispositivos, double precio, String metodo, String cobro) {
		super(usuario, plan, dispositivos);
		this.precio = precio;
		this.metodo = metodo;
		this.cobro = cobro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getCobro() {
		return cobro;
	}

	public void setCobro(String cobro) {
		this.cobro = cobro;
	}

	@Override
	public String toString() {
		return "Pago [precio=" + precio + ", metodo=" + metodo + ", cobro=" + cobro + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
