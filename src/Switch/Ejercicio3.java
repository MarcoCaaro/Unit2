package Switch;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable entera del numero 1 y numero 2
	double num1;
	double num2;
	
	//Declaramos la cadena de la eleccion;
	String eleccion;
	double suma;
	double resta;
	double multiplicacion;
	double division;
	//Pedimos los dos numeros
	System.out.println("Introduce dos numeros: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	//Imprimimos el índice
	System.out.println("A. SUMAR LOS NUMEROS ");
	System.out.println("B. RESTAR LOS NUMEROS ");
	System.out.println("C. MULTIPLICAR LOS NUMEROS ");
	System.out.println("D. DIVIDIR LOS NUMEROS ");
	System.out.println();
	
	//Pedimos que elija una opcion
	System.out.println("Seleccione una opcion: ");
	
	//La guardamos en el scanner
	eleccion = sc.next();
	
	
	switch (eleccion) {
	//Para la opcion A imprimimos la suma
	case "A", "a" -> {
		suma = num1 + num2;
		System.out.println("El resultado de la suma es: " + suma);
	}
	//Para la opcion B imprimimos la resta
	case "B", "b" -> {
		resta = num1 - num2;
		System.out.println("El resultado de la resta es: " + resta);
	}
	//Para la opcion C imprimimos la multiplicacion
	case "C", "c" -> {
		multiplicacion = num1 * num2;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
	}
	//Para la opcion D imprimimos la division
	case "D", "d" -> {
		division = num1 / num2;
		if (num2 == 0) {
			System.out.println("Error: No se puede dividir entre 0");
		}		
		else { System.out.print("El resultado de la division es: " + division); 
	}
	
	}}
	sc.close();
}}
