package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// en el paquete com.logica se encuentra la clase encargada de resolver la
	// soperaciones
	// vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;

	// vamos a declarar una variable auxiliar para incremenetar el folio en nuestro
	// ticket
	private int folio = 1;

	public Cajero() {
		super();
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// necesitamos crear una cuenta bacia inicialmente
		Cuenta cuenta = null;
		// asignamos posteriormente la ceunta si existe en el Hashmap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		// vamos abuscar la cuenta y necesitamos hacer unas validaciones
		// en este caso si se encuentra o lacalica la cuenta la asignamos para
		// manipularla
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// una vez localidada la cuenta para manipular realizamos diferentes
			// validaciones
			if (monto > 9000) {// validamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			} else if (cuenta.getSaldo() < monto) {// si el saldo es meno al monto a retirar mandamos un mensaje a
													// consola
				System.out.println("Saldo insuficiente");
				return ticket;
			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo de la cuenta");
				return ticket;
			} else {// si el retiro puede realizarce
					// actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);// realizamos el retiro
				// entonces ahora si emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No existe una cuenta asociada al cliente");
			return ticket;
		}

	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;

		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// comenzamos a hacer validaciones
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido a la cuenta");
				return ticket;
			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo escederia el maximo permitido en la cuenta");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a este cliente");
			return ticket;
		}

	}

}
