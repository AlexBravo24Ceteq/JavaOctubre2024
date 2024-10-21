package com;

//la multiherencia java no exite
//una clase hija no puede tener dos clases padre
//aqui en java se puede simular la multiherencia
// con el uso de interfaces
//La implementacion de una interface o más de una 
// se hace con la palabra reservada ikmplements
import java.util.Scanner;

public class Científica extends Calculadora implements ITermometro {
	
	private double numero1;
	private double numero2;
	private double respuesta;
	
public Científica () {
		
	}
	
	public Científica(String marca, String color, int precio, boolean existencia, double numero1, double numero2,
			double respuesta) {
		super(marca, color, precio, existencia);
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.respuesta = respuesta;
	}

	
	
	public double getNumero1() {
		return numero1;
	}



	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}



	public double getNumero2() {
		return numero2;
	}



	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}



	public double getRespuesta() {
		return respuesta;
	}



	public void setRespuesta(double respuesta) {
		this.respuesta = respuesta;
	}



	@Override
	public String toString() {
		return "Científica [numero1=" + numero1 + ", numero2=" + numero2 + ", respuesta=" + respuesta + ", toString()="
				+ super.toString() + "]";
	}



	@Override
	public void sumar() {
		double x;
		double y;
		double xy;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame tu primer numero");
		x=entrada.nextDouble();
		System.out.println("Dame tu segundo numero");
		y=entrada.nextDouble();
		xy= x+y;
		System.out.println("Vamos a sumar " + x +"+ "+" numero2 "+ y +" = "+ xy);
//		entrada.close();
	}

	@Override
	public void restar() {
		double w;
		double z;
		double wz;
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Dame tu primer numero");
		w=entrada1.nextDouble();
		System.out.println("Dame tu segundo numero");
		z=entrada1.nextDouble();
		wz= w-z;
		System.out.println("Vamos a restar " + w +"- "+" numero2 "+ z +" = "+wz);
//		entrada1.close();
		
	}

	@Override
	public void multiplicar() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame tu primer numero");
		numero1=entrada.nextDouble();
		System.out.println("Dame tu segundo numero");
		numero2=entrada.nextDouble();
		respuesta= numero1*numero2;
		System.out.println("Vamos a multiplicar " + numero1 +"* "+" numero2 "+ numero2 +" = "+respuesta);
//		entrada.close();
		
	}

	@Override
	public void dividir() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame tu primer numero");
		numero1=entrada.nextDouble();
		System.out.println("Dame tu segundo numero");
		numero2=entrada.nextDouble();
		respuesta= numero1/numero2;
		System.out.println("Vamos a dividir " + numero1 +" / "+" numero2 "+ numero2 +" = "+respuesta);
//		entrada.close();
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	//Nuestros objetos pueden tomar comportamientos de 3 lados:
	/* 1. de sus clases o metodos propios
	 * 2. de otras clases heredandolos, incluyendo clases abstractas
	 * 3. de interfaces
	 */

}//end
