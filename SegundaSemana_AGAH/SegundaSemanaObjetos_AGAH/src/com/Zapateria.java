package com;

public class Zapateria {

	private String marca;
	private String tipodeZapato;
	private int cantidad;
	private double precio;
	
	public Zapateria() {
	
	
	}
	
	
	public Zapateria(String marca, String tipodeZapato, int cantidad, double precio) {
		super();
		this.marca = marca;
		this.tipodeZapato = tipodeZapato;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipodeZapato() {
		return tipodeZapato;
	}


	public void setTipodeZapato(String tipodeZapato) {
		this.tipodeZapato = tipodeZapato;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Zapateria [marca=" + marca + ", tipodeZapato=" + tipodeZapato + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
}
