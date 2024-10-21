package com;

public class Computadora {

	private String marca;
	private double precio;
	private String sistemaOperativo;
	private String procesador;
	private boolean laptop;
	
	public Computadora() {
		
	}

	public Computadora(String marca, double precio, String sistemaOperativo, String procesador, boolean laptop) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.sistemaOperativo = sistemaOperativo;
		this.procesador = procesador;
		this.laptop = laptop;
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

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public boolean isLaptop() {
		return laptop;
	}

	public void setLaptop(boolean laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", precio=" + precio + ", sistemaOperativo=" + sistemaOperativo
				+ ", procesador=" + procesador + ", laptop=" + laptop + "]";
	}
	
	
	
}
