package com;

public class PC {

	private String motherBoard;
	private String tipoEnfriamiento;
	private int capacidad;
	private Cpu Cpu;
	private Gpu Gpu;
	private Psu Psu;
	
	
	public PC() {
		
	}


	public PC(String motherBoard, String tipoEnfriamiento, int capacidad, com.Cpu cpu, com.Gpu gpu, com.Psu psu) {
		super();
		this.motherBoard = motherBoard;
		this.tipoEnfriamiento = tipoEnfriamiento;
		this.capacidad = capacidad;
		Cpu = cpu;
		Gpu = gpu;
		Psu = psu;
	}


	public String getMotherBoard() {
		return motherBoard;
	}


	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}


	public String getTipoEnfriamiento() {
		return tipoEnfriamiento;
	}


	public void setTipoEnfriamiento(String tipoEnfriamiento) {
		this.tipoEnfriamiento = tipoEnfriamiento;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public Cpu getCpu() {
		return Cpu;
	}


	public void setCpu(Cpu cpu) {
		Cpu = cpu;
	}


	public Gpu getGpu() {
		return Gpu;
	}


	public void setGpu(Gpu gpu) {
		Gpu = gpu;
	}


	public Psu getPsu() {
		return Psu;
	}


	public void setPsu(Psu psu) {
		Psu = psu;
	}


	@Override
	public String toString() {
		return "PC [motherBoard=" + motherBoard + ", tipoEnfriamiento=" + tipoEnfriamiento + ", capacidad=" + capacidad
				+ ", Cpu=" + Cpu + ", Gpu=" + Gpu + ", Psu=" + Psu + "]";
	}


	


	

	
	
	
	
}
