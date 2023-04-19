package br.ucsal;

import java.util.Iterator;

public class calculadora {
	
	//fatorial Não recursivo
	public static int fatorial (int num) {
		if (num == 0) {
			return 1;
		}
		 
		int total = 1;
		for (int i = num; i>1; i--) {
			total *= i;
		}
		return total;
	}
	
	//fatoriaRecursivo(5) = 5 * fatoriaRecursivo(4);
	//fatoriaRecursivo(4) = 4 * fatoriaRecursivo(3);
	//fatoriaRecursivo(3) = 3 * fatoriaRecursivo(2);
	//fatoriaRecursivo(2) = 2 * fatoriaRecursivo(1);
	//fatoriaRecursivo(1) = 5 * fatoriaRecursivo(0);
	//fatoriaRecursivo(0) = 1;
	public static int fatoriaRecursivo(int num ) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * fatoriaRecursivo(num-1);
	}

}
