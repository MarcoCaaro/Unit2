package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		
	Random aleatorio = new Random();
		
	Scanner sc = new Scanner(System.in);
	
	double tabla[] = new double[5];
	
	System.out.println("Introduce 5 madafokin numeros");
	for (int i=0; i<5; i++) {
		
		tabla[i] = sc.nextDouble();
		
	}
	
	for (int i=0; i<5; i++) {
		System.out.println(tabla[i]);
	}

		sc.close();
	
	}
}
