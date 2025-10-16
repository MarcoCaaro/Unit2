package Diagrams;

import java.util.Scanner;

public class Ejercicio01 {
public static void main(String[] args) {
	
	//Declaramos la variable entera edad
	int edad;
	
	//Inicializamos el scanner
	Scanner sc = new Scanner (System.in);
	
	//Imprimimos la pregunta
	System.out.print("Introduce tu edad: ");
	
	//Recogemos la respuesta
	edad = sc.nextInt();
	//Iniciamos el condicional de la edad
	if(edad>=18) {
		System.out.print("Eres mayor de edad.");
	}
			
}
}
