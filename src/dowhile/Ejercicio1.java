package dowhile;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	
	//Definimos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable contador
	int contador = 0;
	
	//Imprimimos la peticion
	System.out.println("Los 20 primeros numero naturales son: ");
	
	
	do {
		++contador;
		System.out.println(contador);
	} while (contador<20);
		
	sc.close();
}
}
