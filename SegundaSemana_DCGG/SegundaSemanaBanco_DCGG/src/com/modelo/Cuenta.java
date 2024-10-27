package com.modelo;

public class Cuenta {
	
	// en el paquete com.modelo guardaremos la informacion de los
	// modelos o entidades a los cuales queremos acceder
	// en este ejemplo necesitamos crear varias cuentas de usuario
	// y las agregaremos a un HashMap para
	// simular una pequeña BD
	
	private long numeroCuenta;
	private String usuario;
	private double saldo;
	private double saldoMinimo;
	private double saldoMaximo;
	private String tipoCuenta;
	
	public Cuenta(){}

	public Cuenta(
			long numeroCuenta, 
			String usuario, 
			double saldo, 
			double saldoMinimo, 
			double saldoMaximo,
			String tipoCuenta) 
	{
		super();
		this.numeroCuenta = numeroCuenta;
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMinimo = saldoMinimo;
		this.saldoMaximo = saldoMaximo;
		this.tipoCuenta = tipoCuenta;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	public void setSaldoMaximo(double saldoMaximo) {
		this.saldoMaximo = saldoMaximo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", usuario=" + usuario + ", saldo=" + saldo + ", saldoMinimo="
				+ saldoMinimo + ", saldoMaximo=" + saldoMaximo + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	

}
