package bucles;

import java.util.Scanner;

public class Ejercicio6Bien {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int lado; 
	System.out.println("Introduce el tamaño del triangulo");
	lado = sc.nextInt();
	
	for (int i = 1; i<=lado; i++) {
		for (int j = 1; j <= lado - i; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= 2*i-1; k++) {
		System.out.print("*");
	
		}
		System.out.println(" ");
	}
	
	}	
	}
