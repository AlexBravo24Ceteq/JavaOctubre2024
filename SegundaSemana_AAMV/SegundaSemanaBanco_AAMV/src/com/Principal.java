package com;

import java.util.HashMap;
import java.util.Map;

import com.Logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo
		//de 2 formas.
		//Creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//Segunda forma de agragr cuentas en nuestro HashMap
		//Creando las cuentas directamente en el HashMap
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		//Lo haciamos mediante 
		
//		System.out.println(cuentas.get(1003));
		
		//Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		
		System.out.println(angelopolis.consultar(1001));
		
		//Probar el metodo retirar exitoso
		
		//System.out.println(angelopolis.retirar(1001, 8000));
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 10000));
		
		//Quiero retirar dinero de una cuenta que no existe
		
		System.out.println(angelopolis.retirar(1006, 1000));
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Probar el metodo depositar exitoso
		
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 21000));
		

	}

}
