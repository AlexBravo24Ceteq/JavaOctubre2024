package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	// En el paquete com.logica se encuetra la clase
	// encargada de resolver las operaciones
	
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	
	// Declarar una variable auxiliar para incrementar el folio
	// en nuestro ticket
	private int folio = 1;
	
	public Cajero(){}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultarCuenta(int numeroCuenta) {
		Cuenta cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		// vamos a buscar la cuenta y necesitamos hacer unas validaciones
		// 1 si existe la cuenta la asignamos para manipularla
		if( consultarCuenta(numeroCuenta) != null ) {
			Cuenta cuenta = consultarCuenta(numeroCuenta);
			// realizar validaciones
			if(monto > 9000) { // validar el monto máximo permitido por el cajero
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;
			}else if( cuenta.getSaldo() < monto ) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			}else if(cuenta.getSaldo() - monto < cuenta.getSaldoMinimo()) {
				System.out.println("El retiro dejaria por debajo del mínimo a la cuenta");
				return ticket;
			}else { // el retiro puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()-monto);// realizamos retiro
				//Entonces emitimos el ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
			
		}else {
			System.out.println("No existe una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(consultarCuenta(numeroCuenta) != null) {
			Cuenta cuenta = consultarCuenta(numeroCuenta);
			
			// validaciones 
			if(monto > cuenta.getSaldoMaximo()) {
				System.out.println("El monto a depositar el máximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo()+monto > cuenta.getSaldoMaximo()) {
				System.out.println("El saldo excede el máximo permitido");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
				
	}

}
