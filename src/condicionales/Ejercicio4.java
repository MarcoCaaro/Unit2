package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	
	//Inicializamos el scanner
	Scanner sc = new Scanner(System.in);
	
	//variable aleatoria
	Random aleatorio = new Random();
	
	//Declaramos las variables enteras de los numeros
	int num1 = aleatorio.nextInt(1, 99);
	int num2 = aleatorio.nextInt(1, 99);
	int resultado;
	
	//Pedimos que se introduzcan los numeros
	System.out.println("Suma los dos siguientes numeros: " + num1 + " + " + num2);
	resultado = num1 + num2;
	
	resultado = sc.nextInt();
	
	if (num1 + num2 == resultado) {
		System.out.println("Es correcto.");
	} else { System.out.println("Resultado incorrecto.");
	
	
	
}
	sc.close();
}}