package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
//		creando la BD(HashMap)
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
//		agregando cuentas
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, alex);
//		otra forma de agregar cuentas 
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
//		recuperando el valor de un objeto lo hace el cajero
//		System.out.println(cuentas.get(1003));
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		System.out.println(angelopolis.consultar(1001));
	
//		probando el métod retirar exitoso
//		System.out.println(angelopolis.retirar(1001, 8000));
		
//		probando retirar con el mínimo
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
//		cuenta inexistente al usar retirar
		System.out.println(angelopolis.retirar(1006, 1000));
		
//		pablo, saldo insufieciente
//		System.out.println(angelopolis.retirar(1004, 1000));
		
//		probar depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
//		depositar a humberto 15000
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));

	}

}
