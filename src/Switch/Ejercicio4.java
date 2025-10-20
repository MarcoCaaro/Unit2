package Switch;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable cadena de la tirada 1 y la tirada 2
	String tirada1;
	String tirada2;
	int num1 = 0;
	int num2 = 0;
	
	double suma;
	
	//Pedimos los dos numeros
	System.out.println("¿Cuanto has sacado en la primera tirada?: ");
	tirada1 = sc.next();
	switch (tirada1) {
	case "UNO" -> {
		num1 = 1;
	}
	case "DOS" -> {
		num1 = 2;
	}
	case "TRES" -> {
		num1 = 3;
	}
	case "CUATRO" -> {
		num1 = 4;
	}
	case "CINCO" -> {
		num1 = 5;
	}
	case "SEIS" -> {
		num1 = 6;
	}
	
	default -> { System.out.print("Valor incorrecto");
	
	}
	}

	System.out.println("¿Y cuanto has sacado en la segunda tirada?: ");
	tirada2 = sc.next();
	switch (tirada2) {
	case "UNO" -> {
		num2 = 1;
	}
	case "DOS" -> {
		num2 = 2;
	}
	case "TRES" -> {
		num2 = 3;
	}
	case "CUATRO" -> {
		num2 = 4;
	}
	case "CINCO" -> {
		num2 = 5;
	}
	case "SEIS" -> {
		num2= 6;
	}
	
	default ->  System.out.println("Valor incorrecto");
	}
	
	suma = num1 + num2;
	System.out.print("El resultado de la suma de tus tiradas es: " + suma);
}}
	
	


	
	



	
	
	
	
