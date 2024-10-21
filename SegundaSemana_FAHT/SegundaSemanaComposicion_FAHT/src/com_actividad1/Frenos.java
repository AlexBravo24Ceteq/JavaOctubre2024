package com_actividad1;

public class Frenos {

	private boolean ventilado;
	private boolean Abs;
	private boolean lobulado;
	
	public Frenos () {	
	}

	public Frenos(boolean ventilado, boolean abs, boolean lobulado) {
		super();
		this.ventilado = ventilado;
		Abs = abs;
		this.lobulado = lobulado;
	}

	public boolean isVentilado() {
		return ventilado;
	}

	public void setVentilado(boolean ventilado) {
		this.ventilado = ventilado;
	}

	public boolean isAbs() {
		return Abs;
	}

	public void setAbs(boolean abs) {
		Abs = abs;
	}

	public boolean isLobulado() {
		return lobulado;
	}

	public void setLobulado(boolean lobulado) {
		this.lobulado = lobulado;
	}

	@Override
	public String toString() {
		return "Frenos [ventilado=" + ventilado + ", Abs=" + Abs + ", lobulado=" + lobulado + "]";
	}
	
	
	
}
