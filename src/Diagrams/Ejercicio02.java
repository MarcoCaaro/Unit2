package Diagrams;

import java.util.Scanner;

public class Ejercicio02 {
public static void main(String[] args) {
	int edad;
	Scanner sc = new Scanner (System.in);
	System.out.print("Introduce tu edad: ");
	edad = sc.nextInt();
	if(edad>=18) {
		System.out.print("Eres mayor de edad.");
	}
	else { System.out.print("Eres menor de edad.");	
	}
	}
}
