package com;

public class Principal {

	public static void main(String[] args) {
		
		Gpu gpu = new Gpu("Nvidia", "3070ti", 8);
		Cpu cpu = new Cpu("Amd", "Ryzen 9", 4);
		Psu psu = new Psu("Cooler Master", "Plata", 800);
		
		PC pcMaster = new PC("ASUS B550", "Liquida", 1000,cpu,gpu,psu);
		
		System.out.println(pcMaster);

	}

}
