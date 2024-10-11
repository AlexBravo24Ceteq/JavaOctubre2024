package com.ciclos;

public class Ciclos4_FAHT {

	public static void main(String[] args) {
		for (int hora = 0; hora < 24; hora++) {
			for (int min = 0; min < 60; min++) {
				for (int seg = 0; seg < 60; seg++) {
					System.out.printf("%02d:%02d:%02d\n",hora,min,seg);
				}
			}
		}

		
	}//end

}
