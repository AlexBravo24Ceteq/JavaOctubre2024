package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{

		//En el paquete com.logica se encuentra la clase encargada
		//de resolver las operaciones
	
	//Declarar atributos en cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar el folio en el ticket
	private int folio = 1;
	
	public Cajero() {}	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		
		//Crear cuenta vacia 
		Cuenta cuenta = null;
		
		//Asignamos la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//Buscar la cuenta y hacer validaciones
		//Primero, si se encuentra la cuenta, la asignamos
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Una vez localizada la cuenta, validamos
			if (monto > 9000) { //Validamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			} else if (cuenta.getSaldo() < monto) { //Si saldo es menor al monto a retirar
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del minimo a la cuenta");
				return ticket;
			} else { //Si el retiro puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto); //realizamos el retiro
				//Operacion exitosa, generamos ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No existe una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones;
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo excedería el maximo permitido");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	

}
