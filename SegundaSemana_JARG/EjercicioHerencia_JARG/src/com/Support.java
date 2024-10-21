package com;

public class Support extends Usuario {
	
	private String afiliacion;
	private final static int puntosVida = 1000;
	private final static int puntosCura = 165;
	private final static int puntosMagia = 1500;
	
	public Support () {}

	public Support(String nombreUsuario, String genero, int edad, String afiliacion) {
		super(nombreUsuario, genero, edad);
		this.afiliacion = afiliacion;
	}

	public String getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(String afiliacion) {
		this.afiliacion = afiliacion;
	}

	public static int getPuntosvida() {
		return puntosVida;
	}

	public static int getPuntoscura() {
		return puntosCura;
	}

	public static int getPuntosmagia() {
		return puntosMagia;
	}

	@Override
	public String toString() {
		return "Support [afiliacion=" + afiliacion + ", toString()=" + super.toString() + "]";
	}
	
	

}
