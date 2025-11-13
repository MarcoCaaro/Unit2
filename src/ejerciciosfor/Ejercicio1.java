package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = 0;
	
	System.out.println("Introduce un numero aleatorio");
	num = sc.nextInt();
	
	for (int i = 0; i <= num; i++) {
		
		System.out.println(i + " ");
	}
	sc.close();
}
}
