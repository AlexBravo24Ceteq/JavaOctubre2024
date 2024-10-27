package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	//En el paquete com.logica se encuentra la clase
	//encargada de resolver las operaciones
	
	//Vamos a declarar unos atributos a nuestro cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para
	//incremnentar el folio en nuestri ticket
	private int folio=1;
	
	public Cajero () {}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos creae uan cuenta vacia inicialmente
		Cuenta cuenta = null;
		
		//Entonces asignamos posteriormente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
				
		//Vamos a buscar la cuenta y necesitamos hacer validaciones
		//Primero, si se encuentra o locxaliza la cuenta la 
		//asignamos para manipularla
		if (consultar (numeroCuenta) !=null) {
			Cuenta cuenta = consultar (numeroCuenta);
			//Una vez localizada la cuenta para manioular 
			//realizamos ciertas validaciones
			if (monto> 9000) {//vañidamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {//si el saldo es menor al monto a retirar
				System.out.println("Saldo insufuciente para retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldomin()) {
				System.out.println("El retiro dejaria por debajo del minimo de la cuenta");
				return ticket;
			}else {// si el retiro puede realizarse //actializamos saldo de cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //realizamos retiro
				//Ahora si emitimos nuevo ticket
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
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldomax()) {
				System.out.println("El monto a depositar excede el maximo permitido de cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldomax()) {
				System.out.println("El saldo excederia el máximo permitido en la cuenta");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a este cliente");
			return ticket;
		}
		
		
	}

}//end
