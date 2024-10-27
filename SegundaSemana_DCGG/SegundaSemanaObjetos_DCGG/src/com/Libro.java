package com;

public class Libro {

	private String titulo;
	private int numeroPaginas;
	private boolean isEbook;
	private Double precio;
	
	public Libro(){}
	
	public Libro(String titulo, int numeroPaginas, boolean isEbook, Double precio) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.isEbook = isEbook;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public boolean isEbook() {
		return isEbook;
	}

	public void setEbook(boolean isEbook) {
		this.isEbook = isEbook;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", isEbook=" + isEbook + ", precio="
				+ precio + "]";
	}
	
	
}
