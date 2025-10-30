package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	
	//Inicializamos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable suma y le damos valor
	double suma = 0;
	int numero;
	double media;
	double cantidad = 0;
	
	//Imprimimos la primera peticion
	System.out.println("Introduce un numero: ");
	
	//Leemos el numero
	numero = sc.nextInt();
	

	
	while (numero >= 0) {
		suma += numero;
		cantidad += 1;
		System.out.println("Perfecto, introduzca otro numero: ");
		numero = sc.nextInt();
	if (numero<0) {
		System.out.println("Fin, la suma de los numeros introducidos es: " + suma);
		media = suma / cantidad;
		System.out.println("Por ello la media de estos mismo es de: " + media);
	}
	}
	sc.close();
}
}