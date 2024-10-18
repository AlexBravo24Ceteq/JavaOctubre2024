package com;

public class Mesa {
	
	private int numeroPatas;
	private String tipoMadera;
	private String color;
	private Double precio;
	
	public Mesa() {}
	
	public Mesa(int numeroPatas, String tipoMadera, String color, Double precio) {
		super();
		this.numeroPatas = numeroPatas;
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.precio = precio;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + ", tipoMadera=" + tipoMadera + ", color=" + color + ", precio="
				+ precio + "]";
	}
	
	
	
	
}
