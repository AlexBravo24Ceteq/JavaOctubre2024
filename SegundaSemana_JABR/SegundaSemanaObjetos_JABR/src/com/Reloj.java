package com;

public class Reloj {

	private String marca;
	private double precio;
	private String caratula;
	private String correa;
	private boolean manecillas;
	
	public Reloj() {
		
	}

	public Reloj(String marca, double precio, String caratula, String correa, boolean manecillas) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.caratula = caratula;
		this.correa = correa;
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

	public String getCorrea() {
		return correa;
	}

	public void setCorrea(String correa) {
		this.correa = correa;
	}

	public boolean isManecillas() {
		return manecillas;
	}

	public void setManecillas(boolean manecillas) {
		this.manecillas = manecillas;
	}

	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", precio=" + precio + ", caratula=" + caratula + ", correa=" + correa
				+ ", manecillas=" + manecillas + "]";
	}
	
}
