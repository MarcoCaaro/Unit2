package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
		
	Random aleatorio = new Random();
		
	Scanner sc = new Scanner(System.in);
	
	double tabla[] = new double[10];
	
	System.out.println("Introduce 10 madafokin numeros");
	for (int i=0; i<tabla.length; i++) {
		tabla[i] = sc.nextDouble();
		
	}
	
	for (int i = tabla.length - 1; i>0 ;i-- ) {
		System.out.println(tabla[i]);
	}

		sc.close();
	
	}
}
