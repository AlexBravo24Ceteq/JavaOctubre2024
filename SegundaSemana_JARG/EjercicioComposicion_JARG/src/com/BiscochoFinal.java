package com;

public class BiscochoFinal {
	
	private String merengue;
	private String decoracion;
	private String sabor;
	private String dedicatoria;
	private int cantidadVelas;
	
	public BiscochoFinal() {}

	public BiscochoFinal(String merengue, String decoracion, String sabor, String dedicatoria, int cantidadVelas) {
		super();
		this.merengue = merengue;
		this.decoracion = decoracion;
		this.sabor = sabor;
		this.dedicatoria = dedicatoria;
		this.cantidadVelas = cantidadVelas;
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

	public String getDedicatoria() {
		return dedicatoria;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public int getCantidadVelas() {
		return cantidadVelas;
	}

	public void setCantidadVelas(int cantidadVelas) {
		this.cantidadVelas = cantidadVelas;
	}

	@Override
	public String toString() {
		return "BiscochoFinal [merengue=" + merengue + ", decoracion=" + decoracion + ", sabor=" + sabor
				+ ", dedicatoria=" + dedicatoria + ", cantidadVelas=" + cantidadVelas + "]";
	}
	
	

}
