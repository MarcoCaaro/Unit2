package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
	Scanner sc = new Scanner(System.in);
	
	int enteros[] = new int[10];
	
		for (int i=0; i<enteros.length; i++) {
			enteros[i] = aleatorio.nextInt(100); 
		}
			
		System.out.println(Arrays.toString(enteros));
		
		sc.close();
	
	}
}
