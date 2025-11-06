package dowhile;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	
	//Definimos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable contador
	//int contador = 0;
	int num = 0;
	int numInt;
	int contador = 1;
	
	//Imprimimos la peticion
	System.out.println("Introduce un numero: ");
	numInt = sc.nextInt();
	
	
	do {
		num+=contador;
		contador++;
	} while (contador <= numInt);
	
	System.out.println(num);
	sc.close();
}
}