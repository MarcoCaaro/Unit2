package Diagrams;

import java.util.Scanner;

public class Ejercicio07 {
public static void main(String[] args) {
	//Declaramos la variable entera del numero 1
	int n1;
	
	//Declaramos la variable entera del numero 2
	int n2;
	
	//Declaramos el scanner
	Scanner sc = new Scanner (System.in);
	
	//Imprimimos la peticion
	System.out.print("Introduce dos numeros: ");
	
	//Recogemos los numeros
	n1 = sc.nextInt();
	n2 = sc.nextInt();

	//Iniciamos la condicion
	if(n1>n2) {
		System.out.print("El numero 1 es el mayor.");
	}
	//Establecemos la segunda condicion
	else if(n1==n2 ) {
		System.out.print("Los numeros son iguales.");
	}
	//Establecemos que pasaria si no se cumple la segunda condicion
	else {	System.out.print("El numero 2 es el mayor.");
	
	}
	//Cerramos el scanner
	sc.close();
	}

}