package Diagrams;

import java.util.Scanner;

public class Ejercicio05 {
public static void main(String[] args) {
	//Declaramos la variable entera del numero 1
	int n1;
	
	
	//Declaramos el scanner
	Scanner sc = new Scanner (System.in);
	
	//Imprimimos la peticion
	System.out.print("Introduce un numero: ");
	
	//Recogemos los numeros
	n1 = sc.nextInt();
	
	//Iniciamos la condicion
	if(n1>=0) {
		System.out.print("El numero es positivo");
	}
	//Establecemos que pasaria si no se cumple
	else {	System.out.print("El numero es negativo.");
	
	}
	//Cerramos el scanner
	sc.close();
	}

}
