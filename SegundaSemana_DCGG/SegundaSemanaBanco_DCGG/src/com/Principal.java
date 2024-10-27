package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// creamos nuestras BD
		// declaramos nuestro HashMap
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		// agregar cuentas a nuestro HashMap
		// forma 1
		Cuenta alex = new Cuenta(12345, "Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(12345, alex);
		
		// agregar cuentas a nuestro HashMap
		// forma 2 agregando directamente a HashMap
		cuentas.put(1002, new Cuenta(1002, "Berenice", 1000, 100, 15000, "Debito"));
		
		// agregando mas cuentas
		cuentas.put(1003, new Cuenta(1003, "Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta(1004, "Pablo", 500, 100, 10000, "Debito"));
		
		// crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		// probar el método consultar
		System.out.println(angelopolis.consultarCuenta(1003));
		
		// probar el método retirar exitoso
		System.out.println(angelopolis.retirar(12345, 9000));
		
		// probar el método retirar con respuesta fracaso
		System.out.println(angelopolis.retirar(12345, 10000));
		
		// probar el método retirar con respuesta de cuenta no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		// probar método retirar con respuesta saldo insuficiente
		System.out.println(angelopolis.retirar(1004, 1000));
		
		// probar el método depositar exitoso
		System.out.println(angelopolis.depositar(12345, 5000));
		
		// probar metodo depositar con excedente
		System.out.println(angelopolis.depositar(1003, 21000));
		
		

	}

}
