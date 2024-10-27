package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// Crear base de datos
		
		//Declaramos HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Agregar cuentas en HashMap:
		
		//Crear cuenta y agregarla después
		Cuenta oliver = new Cuenta("Oliver", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, oliver);
		
		//Crear cuentas directamente en HashMap
		cuentas.put(1002, new Cuenta("Matt", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Brad", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Rob", 500, 100, 10000, "Debito"));
		
		//Recuperar el valor de un objeto en HashMap
		//System.out.println(cuentas.get(1003));
		
		//Crear cajero nuevo
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//Metodo retiro exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Cuenta no existente
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Deposito exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));
		
	}

}
