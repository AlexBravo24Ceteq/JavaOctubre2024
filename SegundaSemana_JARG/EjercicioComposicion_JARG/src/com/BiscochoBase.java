package com;

public class BiscochoBase {
	private String merengue;
	private String decoracion;
	private String sabor;
	
	public BiscochoBase() {}

	public BiscochoBase(String merengue, String decoracion, String sabor) {
		super();
		this.merengue = merengue;
		this.decoracion = decoracion;
		this.sabor = sabor;
	}

	public String getMerengue() {
		return merengue;
	}

	public void setMerengue(String merengue) {
		this.merengue = merengue;
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
		return "BiscochoBase [merengue=" + merengue + ", decoracion=" + decoracion + ", sabor=" + sabor + "]";
	}
	
	
}
