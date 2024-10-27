package com;

public class Balones {
	
	private String tipo;
	private String material;
	private int precio;
	
	public Balones() {
	}

	public Balones(String tipo, String material, int precio) {
		super();
		this.tipo = tipo;
		this.material = material;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Balones [Tipo=" + tipo + ", Material=" + material + ", Precio=" + precio + "]";
	}
	
	
}
