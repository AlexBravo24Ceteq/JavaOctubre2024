package com;

public class Reloj {

	private String marca;
	private double precio;
	private String caratula;
	private boolean manecillas;
	
	public Reloj() {
		
		
	}

	public Reloj(String marca, double precio, String caratula, boolean manecillas) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.caratula = caratula;
		this.manecillas = manecillas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public boolean isManecillas() {
		return manecillas;
	}

	public void setManecillas(boolean manecillas) {
		this.manecillas = manecillas;
	}

	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", precio=" + precio + ", caratula=" + caratula + ", manecillas=" + manecillas
				+ "]";
	}
	
	
}
