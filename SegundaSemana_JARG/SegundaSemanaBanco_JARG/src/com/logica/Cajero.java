package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// En el paquete com.logica se encuentra la clase
	// encargada de resolver las operaciones

	// Vamos a declarar unos atributos de nuestro cajero

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;

	// Declarar una variable auxiliar para incrementar
	// el folio en nuestro ticket

	private int folio = 1;

	public Cajero() {
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {

		// Necesitamos crear una cuenta vacia incialmente
		Cuenta cuenta = null;

		// Entonces asignamos la cuenta si existe en el HashMap

		cuenta = cuentas.get(numeroCuenta);

		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {

		Ticket ticket = null;

		// Vamos a buscar la cuenta y necesitmaos hacer unas validacion
		// Primer, si se encuentra o localiza la cuenta, la asignamos
		// para manipularla

		if (consultar(numeroCuenta) != null) {

			Cuenta cuenta = consultar(numeroCuenta);
			// Una vez localizamos la cuenta para manipular
			// realizamos ciertas validaciones
			if (monto > 9000) {// Validamos si el monto excede el maximo del cajero

				System.out.println("El monto excede el maximo permitido por el cajero");

				return ticket;

			} else if (cuenta.getSaldo() < monto) {// Si el saldo es menor al monto a retirar

				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;

			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {

				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;

			} else {// si el retiro puede realizarse
					// Acualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				// Entonces ahora si emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}

		} else {
			System.out.println("No existe una cuenta asociada");
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
				
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
				
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo total excede su limite permitido en su cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay unca cuenta asociada");
			return ticket;
		}
		
	}

}
