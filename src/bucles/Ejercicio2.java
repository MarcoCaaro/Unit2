package bucles;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	int contador;
	int contadorPrimos = 0;
	System.out.println("Introduce un numero aleatorio");
	num = sc.nextInt();
	
	for ( contador = 2; contador<=num; contador++) {
		boolean esPrimo = true;
		for (int i = 2; i <= contador/2; i++) {
			if (contador%i == 0) {
				esPrimo = false;
			}
						}
		if (esPrimo) {
			contadorPrimos++;
		}
		
	}
	System.out.println(contadorPrimos);
	sc.close();
}
	
}

		
	
		
	
	
	
