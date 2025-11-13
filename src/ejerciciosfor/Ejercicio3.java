package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double num = 0;
	double media = 0;
	double suma = 0;
	
	for (int i = 1; i <= 10; i++) {
			
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		 suma += num;
		
	}
	media = suma/10;
	
	System.out.println("La media de todos estos numeros es: " + media);
	
	sc.close();
	
}
}