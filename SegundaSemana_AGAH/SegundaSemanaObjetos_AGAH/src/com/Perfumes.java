package com;

public class Perfumes {

	private String marca;
	private boolean importado;
	private double costo;
	private int cantidad;
	private boolean promocion;
	
	
	public Perfumes() {
		
	}


	public Perfumes(String marca, boolean importado, double costo, int cantidad, boolean promocion) {
		super();
		this.marca = marca;
		this.importado = importado;
		this.costo = costo;
		this.cantidad = cantidad;
		this.promocion = promocion;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isImportado() {
		return importado;
	}


	public void setImportado(boolean importado) {
		this.importado = importado;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public boolean isPromocion() {
		return promocion;
	}


	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}


	@Override
	public String toString() {
		return "Perfumes [marca=" + marca + ", importado=" + importado + ", costo=" + costo + ", cantidad=" + cantidad
				+ ", promocion=" + promocion + "]";
	}
	
	
	
}
