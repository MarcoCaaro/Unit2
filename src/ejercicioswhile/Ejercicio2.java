package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	
	//Inicializamos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable suma y le damos valor
	int cantidad = 0;
	int numero;
	
	//Imprimimos la primera peticion
	System.out.println("Introduce un numero: ");
	
	//Leemos el numero
	numero = sc.nextInt();
	

	
	while (numero >= 0) {
		cantidad += 1;
		System.out.println("Perfecto, introduzca otro numero: ");
		numero = sc.nextInt();
	if (numero<0) {
		System.out.println("Fin, el numero de numeros enteros positivos introducidos es de: " + cantidad);
	}
	}
	sc.close();
}
}