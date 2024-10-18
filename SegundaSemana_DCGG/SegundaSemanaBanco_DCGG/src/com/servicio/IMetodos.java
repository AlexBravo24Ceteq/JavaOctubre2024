package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	// aqui declaramos las operaciones que la clase
	// encargada de la logica tendra que resolver
	
	// consultar una cuenta de banco
	public Cuenta consultarCuenta(int numeroCuenta);
	
	// retirar recursos de la cuenta
	public Ticket retirar(int numeroCuenta, double monto);
	
	// depositar recursos a la cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
