package dowhile;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	
	//Definimos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable contador
	int contador = 0;
	
	//Imprimimos la peticion
	System.out.println("Los numeros pares del 1 al 200 son: ");
	
	do {
		contador=contador + 2;
		System.out.println(contador);
	} while (contador<200);
		
	sc.close();
}
}