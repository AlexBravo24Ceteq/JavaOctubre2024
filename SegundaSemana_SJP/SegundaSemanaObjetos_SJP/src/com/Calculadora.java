package com;

public class Calculadora {
	
	private String tipo;
	private int precio;
	private boolean descuento;
	private int porcentaje;
	
	public Calculadora() {
	}

	public Calculadora(String tipo, int precio, boolean descuento, int porcentaje) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.descuento = descuento;
		this.porcentaje = porcentaje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Calculadora [Tipo=" + tipo + ", Precio=" + precio + ", Descuento=" + descuento + ", Porcentaje="
				+ porcentaje + "]";
	}
	
	
		
	
}
