package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		//vamos a crear nuestar base de datos 
		//1 -> declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//hay dos formas de agregar cuentas 
		//para agregar cuentas en nuestro Hashmap 
		//la primera es crear una cuenta y agregarla despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, alex);
		
		// la segunda forma de agregar ceuntas en nuestro HashMap
		//crear las cuentas directamente en nuestro hashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Ferrer", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Daniela", 500, 100, 10000, "Debito"));
		
		//para buscar una cuenta para frecuperar el valor de un objeto en mi HashMap
		//System.out.println(cuentas.get(1003));ejemplo de como imprimirla 
		//crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		//provar el emtodo consultar 
		System.out.println(angelopolis.consultar(1001)+ "\n");
		//probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000)+ "\n");
		System.out.println(angelopolis.retirar(1004, 1000)+ "\n");
		//quiero retirar dinero de una cuenta que no exite
		System.out.println(angelopolis.retirar(1006, 1000)+ "\n");
		
		//vamos a provar el emtodo deposita exitoso
		System.out.println(angelopolis.depositar(1001, 5000) + "\n");
		System.out.println(angelopolis.depositar(1003, 21000) + "\n");
		
	}

}
