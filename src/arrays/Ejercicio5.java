package arrays;

import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio5 {
	public static void main(String[] args) {
		
	Random aleatorio = new Random();
		
	Scanner sc = new Scanner(System.in);
	double tabla[] = new double[10];
	
	
	
	System.out.println("Introduce 10 madafokin numeros");
	for (int i=0; i<tabla.length; i++) {
		tabla[i] = sc.nextDouble();
		
	}
	
	double maximo = tabla[0];
	double minimo = tabla[0];
	double suma = 0;
	
	for (int i = 0; i<tabla.length ;i++ ) {
		suma += tabla[i];
		if (tabla[i] > maximo) {
			maximo = tabla[i];
		} 
		else if  (tabla[i] < minimo) {
			minimo = tabla[i];
		}
	}
		System.out.println(suma);
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		
		sc.close();
	
	}
}
