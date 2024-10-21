package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Vamos a crear nuestra base de datos

		// Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Para ]Agregar cuentas en nuestro HashMap podemos Hacerlo de dos formas

		// Creando la cuenta y agregandola despues

		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");

		cuentas.put(1001, alex);

		// Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));

		// Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		// System.out.println(cuentas.get(1003)); -> esta operacion la debe
		// realizar el cajero

		// Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);

		// Probar metodo consultar
		System.out.println(angelopolis.consultar(1006));

		// Probar el método retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		//Retiro no permitido
		System.out.println(angelopolis.retirar(1001, 1000));

		// Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));

		// Quiero retirar dinero de una cuenta con saldo insuficiente
		System.out.println(angelopolis.retirar(1004, 1000));

		// Probar el método depositar esxitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		System.out.println(angelopolis.depositar(1003, 10000));
		
		//Probando validacion excederia
		System.out.println(angelopolis.depositar(1003, 11000));
		
		//Probando validacion excede
		System.out.println(angelopolis.depositar(1003, 21000));
	}

}
