package com;

public class Pastel {
	private int numeroDePedido;
	private String nombreCliente;
	private int total;
	
	private BiscochoBase base;
	private BiscochoMedio medio;
	private BiscochoFinal tercio;
	
	public Pastel() {}
	public Pastel(int numeroDePedido, String nombreCliente, int total, BiscochoBase base, BiscochoMedio medio,
			BiscochoFinal tercio) {
		super();
		this.numeroDePedido = numeroDePedido;
		this.nombreCliente = nombreCliente;
		this.total = total;
		this.base = base;
		this.medio = medio;
		this.tercio = tercio;
	}
	public int getNumeroDePedido() {
		return numeroDePedido;
	}
	public void setNumeroDePedido(int numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public BiscochoBase getBase() {
		return base;
	}
	public void setBase(BiscochoBase base) {
		this.base = base;
	}
	public BiscochoMedio getMedio() {
		return medio;
	}
	public void setMedio(BiscochoMedio medio) {
		this.medio = medio;
	}
	public BiscochoFinal getTercio() {
		return tercio;
	}
	public void setTercio(BiscochoFinal tercio) {
		this.tercio = tercio;
	}
	@Override
	public String toString() {
		return "Pastel [numeroDePedido=" + numeroDePedido + ", nombreCliente=" + nombreCliente + ", total=" + total
				+ "\nbase=" + base + "\nmedio=" + medio + "\ntercio=" + tercio + "]";
	}
	
	
	
	

}
