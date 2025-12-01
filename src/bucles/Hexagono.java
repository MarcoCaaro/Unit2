package bucles;

import java.util.Scanner;

public class Hexagono{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int lado; 
	System.out.println("Introduce el tamaño de la piramide");
	lado = sc.nextInt();
	
	for (int i = 1; i<=lado; i++) {
		for (int j = 1; j <= lado - i; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= lado + i; k++) {
		System.out.print("* ");
	
		}
		System.out.println(" ");
	}
	
	}	
	}