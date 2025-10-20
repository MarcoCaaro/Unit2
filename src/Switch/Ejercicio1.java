package Switch;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable entera de la nota
	int nota;
	
	//Imprimimos la peticion
	System.out.print("Introduce una nota entera del 0 al 10: ");
	
	//La recogemos en el scanner
	nota = sc.nextInt();
	
	switch (nota) {
	//Para los valores del 0 al 4 imprimimos insuficiente
	case 0, 1, 2, 3, 4 -> {
		System.out.print("Insuficiente.");
	}
	//Para el valor 5 imprimimos suficiente
	case 5 -> {
		System.out.print("Suficiente.");
	}
	//Para el valor 6 imprimimos bien
	case 6 -> {
		System.out.print("Bien.");
	}
	//Para los valores del 7 al 8 imprimimos notable
	case 7, 8 -> {
		System.out.print("Notable.");
	}
	//Para los valores del 9 al 10 imprimimos sobresaliente
	case 9, 10 -> {
		System.out.print("Sobresaliente.");
	}
	default -> System.out.print("Valor incorrecto.");
}
	sc.close();
}}

