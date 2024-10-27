package com;

public class Comida {
	
	private String tipoComida;
	private boolean congelada;
	private int numeroIngredientes;
	private Double precio;
	private boolean enlatado;
	
	public Comida(){}
	
	public Comida(String tipoComida, boolean congelada, int numeroIngredientes, Double precio, boolean enlatado) {
		super();
		this.tipoComida = tipoComida;
		this.congelada = congelada;
		this.numeroIngredientes = numeroIngredientes;
		this.precio = precio;
		this.enlatado = enlatado;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public boolean isCongelada() {
		return congelada;
	}

	public void setCongelada(boolean congelada) {
		this.congelada = congelada;
	}

	public int getNumeroIngredientes() {
		return numeroIngredientes;
	}

	public void setNumeroIngredientes(int numeroIngredientes) {
		this.numeroIngredientes = numeroIngredientes;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isEnlatado() {
		return enlatado;
	}

	public void setEnlatado(boolean enlatado) {
		this.enlatado = enlatado;
	}

	@Override
	public String toString() {
		return "Comida [tipoComida=" + tipoComida + ", congelada=" + congelada + ", numeroIngredientes="
				+ numeroIngredientes + ", precio=" + precio + ", enlatado=" + enlatado + "]";
	}
	

}
