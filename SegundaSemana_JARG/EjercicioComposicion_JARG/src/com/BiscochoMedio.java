package com;

public class BiscochoMedio {
	private String glaseado;
	private String decoracion;
	private String sabor;
	
	public BiscochoMedio() {}

	public BiscochoMedio(String glaseado, String decoracion, String sabor) {
		super();
		this.glaseado = glaseado;
		this.decoracion = decoracion;
		this.sabor = sabor;
	}

	public String getGlaseado() {
		return glaseado;
	}

	public void setGlaseado(String glaseado) {
		this.glaseado = glaseado;
	}

	public String getDecoracion() {
		return decoracion;
	}

	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "BiscochoMedio [glaseado=" + glaseado + ", decoracion=" + decoracion + ", sabor=" + sabor + "]";
	}
	
	

}
