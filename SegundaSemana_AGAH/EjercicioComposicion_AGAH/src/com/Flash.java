package com;

public class Flash {

	private String tipo;
	private String calidadIluminacion;
	boolean giratoria;
	
	public Flash() {
		
	}

	public Flash(String tipo, String calidadIluminacion, boolean giratoria) {
		super();
		this.tipo = tipo;
		this.calidadIluminacion = calidadIluminacion;
		this.giratoria = giratoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCalidadIluminacion() {
		return calidadIluminacion;
	}

	public void setCalidadIluminacion(String calidadIluminacion) {
		this.calidadIluminacion = calidadIluminacion;
	}

	public boolean isGiratoria() {
		return giratoria;
	}

	public void setGiratoria(boolean giratoria) {
		this.giratoria = giratoria;
	}

	@Override
	public String toString() {
		return "Flash [tipo=" + tipo + ", calidadIluminacion=" + calidadIluminacion + ", giratoria=" + giratoria + "]";
	}
	
	
	
	
}
