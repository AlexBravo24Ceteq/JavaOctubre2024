package com;

public class Perfume {
	
	private String marca;
	private String olor;
	private double precio;
	private boolean asequible;
	
	public Perfume() {
		
		
	}

	public Perfume(String marca, String olor, double precio, boolean asequible) {
		super();
		this.marca = marca;
		this.olor = olor;
		this.precio = precio;
		this.asequible = asequible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAsequible() {
		return asequible;
	}

	public void setAsequible(boolean asequible) {
		this.asequible = asequible;
	}

	@Override
	public String toString() {
		return "Perfume [marca=" + marca + ", olor=" + olor + ", precio=" + precio + ", asequible=" + asequible + "]";
	}
	

	
	

}
