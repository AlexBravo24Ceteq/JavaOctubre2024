package com;

public class Camara {

	private String marca;
	private String modelo;
	private int serie;
	private Calidad imagen;
	private Procesador funcion;
	private Flash tipo;
	
	public Camara () {
		
	}

	public Camara(String marca, String modelo, int serie, Calidad imagen, Procesador funcion, Flash tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.serie = serie;
		this.imagen = imagen;
		this.funcion = funcion;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Calidad getImagen() {
		return imagen;
	}

	public void setImagen(Calidad imagen) {
		this.imagen = imagen;
	}

	public Procesador getFuncion() {
		return funcion;
	}

	public void setFuncion(Procesador funcion) {
		this.funcion = funcion;
	}

	public Flash getTipo() {
		return tipo;
	}

	public void setTipo(Flash tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", modelo=" + modelo + ", serie=" + serie + ",\nimagen=" + imagen
				+ ", \nfuncion=" + funcion + ", \ntipo=" + tipo + "]\n";
	}
	
	
	
	
}
