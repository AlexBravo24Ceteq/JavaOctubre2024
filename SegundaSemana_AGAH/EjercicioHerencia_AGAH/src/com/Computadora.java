package com;

public class Computadora extends Celulares{

	private String procesador;
	private int ram;
	private String version;
	
	public Computadora() {
		
	}

	public Computadora(String marca, int almacenamiento, String sistemaOperativo, String procesador, int ram,
			String version) {
		super(marca, almacenamiento, sistemaOperativo);
		this.procesador = procesador;
		this.ram = ram;
		this.version = version;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Computadora [procesador=" + procesador + ", ram=" + ram + ", version=" + version + ",\n toString()="
				+ super.toString() + "]";
	}
	
	
	
}
