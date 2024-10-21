package com.servicio;

import com.Respuesta.Ticket;
import com.modelo.Cuenta;

public interface IMetodos {

	// Aqui declaramos las operaciones que la clase encargada de la logica
	// tendra que resolver

	// Consultar una cuenta de banco

	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos en nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
