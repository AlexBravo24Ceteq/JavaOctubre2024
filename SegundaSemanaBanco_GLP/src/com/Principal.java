package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear nuestra base de datos (HashMap)
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Para agregar cuentas en nuestro HashMap
		//podemos hacerlo de dos formas
		
		//1 creando la cuenta y agregandola despues
		Cuenta gerardo = new Cuenta("Gerardo",15000,4000,50000,"Debito");
		
		cuentas.put(1001, gerardo);
		
		//2 creando las cuentas directamente en el HashMap
		
		cuentas.put(1002, new Cuenta("Alo", 10000, 2000, 20000, "Debito"));
		cuentas.put(1003, new Cuenta("Azul", 15000, 2000, 30000, "Debito"));
		cuentas.put(1004, new Cuenta("Marcus", 1000, 1000, 20000, "Debito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		//System.out.println(cuentas.get(1003));
		
		//Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//Probar el metido retirar exitoso
		System.out.println(angelopolis.retirar(1001, 10000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 2000));
		
		//Probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		//Probar si intento depositar el maximo permitido
		System.out.println(angelopolis.depositar(1004, 21000));
		

	}

}
