package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

//clase encarga de reolver las operaciones
public class Cajero implements IMetodos{
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;	
//	variable auxiliar para incremnatra el folio en el ticket
	private int folio = 1;
	
	public Cajero() {
		
	}
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
//Métodos 
	@Override
	public Cuenta consultar(int numeroCuenta) {
		Cuenta cuenta = null;
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
//		mando llamar a consultar y guardandola en cuenta
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
//			validando
			if(monto>9000) {
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;
			} else if(cuenta.getSaldo() < monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			} else if(cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				System.out.println("");
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
		
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			if(monto > cuenta.getSaldoMax()) {
				System.out.println("Monto a depositar excede el máximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("Saldo excede el máximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a este cliente");
			return ticket;
		}
	}
	
}
