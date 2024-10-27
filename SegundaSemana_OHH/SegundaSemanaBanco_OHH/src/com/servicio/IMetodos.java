package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
//	Listado de metodos abstractos que mis clases 
//	va a resolver
	
//	consultar cuneta de banco
	public Cuenta consultar(int numeroCuenta);
	
//	metodo retirar recursos de la cuenta
	public Ticket retirar(int numeroCuenta, double monto);
	
//	metodo depositar recursos de la cuenta
	public Ticket depositar(int numeroCuenta, double monto);	
	
}
