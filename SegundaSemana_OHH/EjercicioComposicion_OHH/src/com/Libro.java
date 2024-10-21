package com;

public class Libro {
	private String nombreLibro;
	private String autor;
	private int numeroPaginas;
	
	public Libro() {
		
	}

	public Libro(String nombreLibro, String autor, int numeroPaginas) {
		super();
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

//	getters y setters
	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "\nNombre del libro: " + nombreLibro + "\nAutor=" + autor + "\nNúmero de páginas=" + numeroPaginas;
	}
}
