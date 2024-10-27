package com_actividad1;

public class Motor {

	private int cc;
	private int cilindros;
	private String tiempos;
	
	public Motor () {	
	}

	public Motor(int cc, int cilindros, String tiempos) {
		super();
		this.cc = cc;
		this.cilindros = cilindros;
		this.tiempos = tiempos;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public String getTiempos() {
		return tiempos;
	}

	public void setTiempos(String tiempos) {
		this.tiempos = tiempos;
	}

	@Override
	public String toString() {
		return "Motor [cc=" + cc + ", cilindros=" + cilindros + ", tiempos=" + tiempos + "]";
	}
	
	
}
