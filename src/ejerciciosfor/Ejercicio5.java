package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//Declaracion de variables
	int num;
	int cont;
	int fact = 1;
	
	System.out.println("Introduce un numero: ");
	num = sc.nextInt();
	
	for (cont = 1; cont<=num; cont++) {
		fact= cont*fact;
		
	}
		
		System.out.println("El factorial del numero introducido es: " + fact);
	
	
	sc.close();
	
}
}