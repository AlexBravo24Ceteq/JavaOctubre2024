package com;

public class PC extends Electronicos{
	
	private String motherBoard;
	private String ramCapa;
	private boolean refrigeranteLiquido;
	//private double precio;
	
	public PC() {
		super();
	}

	

	public PC(String especificacion, String marca, String modelo, double precio, String motherBoard, String ramCapa,
			boolean refrigeranteLiquido) {
		super(especificacion, marca, modelo, precio);
		this.motherBoard = motherBoard;
		this.ramCapa = ramCapa;
		this.refrigeranteLiquido = refrigeranteLiquido;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public String getRamCapa() {
		return ramCapa;
	}

	public void setRamCapa(String ramCapa) {
		this.ramCapa = ramCapa;
	}

	public boolean isRefrigeranteLiquido() {
		return refrigeranteLiquido;
	}

	public void setRefrigeranteLiquido(boolean refrigeranteLiquido) {
		this.refrigeranteLiquido = refrigeranteLiquido;
	}


	@Override
	public String toString() {
		return "PC [motherBoard=" + motherBoard + ", ramCapa=" + ramCapa + ", refrigeranteLiquido="
				+ refrigeranteLiquido + ", precio=" + ", toString()=" + super.toString() + "]";
	}
	
	

}
