package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// En el paquete com.Logica se encuentra la clase encargada
	// de resolver las operaciones

	// Vamos a declarar unos atributos a nuestro cajero
	private String socursal;
	private Map<Integer, Cuenta> cuentas;

	// Declarar variable auxiliar para incrementar el folio
	// en nuestro ticket

	private int folio = 1;

	public Cajero() {

	}

	public Cajero(String socursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.socursal = socursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {

		// Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;

		// Entonces asignamos posteriormente la cuenta si existe en el
		// HashMap

		cuenta = cuentas.get(numeroCuenta);

		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		
		Ticket ticket = null;
		
		//Vamos a buscar la cuenta y necesitamos hacer unas validaciones
		//Primero si se encuentra o localiza la cuenta la asignamos para manipularla
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Una vez localizada la cuenta para manipular realizamos validaciones
			if (monto>9000) {//validamos si el monto excede del maxico delimitado del cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			
			}else if (cuenta.getSaldo() < monto) {//Si el saldo es menor al monto a retirar
				System.out.println("Saldo insuficiente para realizar retiro");
				return ticket;
				
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			}else {//Si el retiro se puede realizar
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//Se realio el retiro
				//Entonces ahora si se emite un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), socursal, 1);
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
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede al maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo excede el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), socursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

}
