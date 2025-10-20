package Switch;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable cadena de la tirada 1 y la tirada 2
	String tirada1;
	String tirada2;
	//Declaramos las variables del numero1 y numero2
	int num1 = 0;
	int num2 = 0;
	
	double suma;
	
	//Pedimos el valor de la primera tirada
	System.out.println("¿Cuanto has sacado en la primera tirada?: ");
	//Lo recogemos en el scanner
	tirada1 = sc.next();
	
	switch (tirada1) {
	//Para el valor UNO, num1 vale 1
	case "UNO" -> {
		num1 = 1;
	}
	//Para el valor DOS, num1 vale 2
	case "DOS" -> {
		num1 = 2;
	}
	//Para el valor TRES, num1 vale 3
	case "TRES" -> {
		num1 = 3;
	}
	//Para el valor CUATRO, num1 vale 4
	case "CUATRO" -> {
		num1 = 4;
	}
	//Para el valor CINCO, num1 vale 5
	case "CINCO" -> {
		num1 = 5;
	}
	//Para el valor SEIS, num1 vale 6
	case "SEIS" -> {
		num1 = 6;
	}
	
	default -> { System.out.print("Valor incorrecto");
	
	}
	}

	System.out.println("¿Y cuanto has sacado en la segunda tirada?: ");
	tirada2 = sc.next();
	switch (tirada2) {
	//Para el valor UNO, num2 vale 1
	case "UNO" -> {
		num2 = 1;
	}
	//Para el valor DOS, num2 vale 2
	case "DOS" -> {
		num2 = 2;
	}
	//Para el valor TRES, num2 vale 3
	case "TRES" -> {
		num2 = 3;
	}
	//Para el valor CUATRO, num2 vale 4
	case "CUATRO" -> {
		num2 = 4;
	}
	//Para el valor CINCO, num2 vale 5
	case "CINCO" -> {
		num2 = 5;
	}
	//Para el valor SEIS, num2 vale 6
	case "SEIS" -> {
		num2= 6;
	}
	
	default ->  System.out.println("Valor incorrecto");
	}
	
	suma = num1 + num2;
	System.out.print("El resultado de la suma de tus tiradas es: " + suma);
	
	sc.close();
}}
	
	


	
	



	
	
	
	
