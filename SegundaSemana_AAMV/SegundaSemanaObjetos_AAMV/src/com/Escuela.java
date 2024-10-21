package com;

public class Escuela {
	
	private String escuela;
	private String sector;
	private String mascota;
	private boolean facilingreso;
	
	public Escuela () {
		
	}

	public Escuela(String escuela, String sector, String mascota, boolean facilingreso) {
		super();
		this.escuela = escuela;
		this.sector = sector;
		this.mascota = mascota;
		this.facilingreso = facilingreso;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public boolean isFacilingreso() {
		return facilingreso;
	}

	public void setFacilingreso(boolean facilingreso) {
		this.facilingreso = facilingreso;
	}

	@Override
	public String toString() {
		return "Escuela [escuela=" + escuela + ", sector=" + sector + ", mascota=" + mascota + ", facilingreso="
				+ facilingreso + "]";
	}
	
	
	
	

}
