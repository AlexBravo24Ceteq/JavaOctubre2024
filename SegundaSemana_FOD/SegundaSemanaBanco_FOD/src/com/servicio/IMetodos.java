package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// declaramos las operaciones que la clase encargada de la logica tendra que
	// resolver
	// consultar la informacion de nuestra cuenta de banco
	public Cuenta consultar(int numeroCuenta);

	// retirar recursos de nuestra ceunta
	public Ticket retirar(int numeroCuenta, double monto);

	// depositar recursos de nuestra ceunta
	public Ticket depositar(int numeroCuenta, double monto);
	
	//trabajo a investigar Expresiones Lambda
	//API Stream




}
