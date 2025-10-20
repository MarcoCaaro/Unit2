package Switch;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	//Inicializamos el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable entera del dia
	int dia;
	
	//Imprimimos la peticion
	System.out.print("Introduce un numero entre el 1 y el 7: ");
	
	//La recogemos en el scanner
	dia = sc.nextInt();
	
	switch (dia) {
	//Para el valor
	case 1 -> {
		System.out.print("Lunes");
	}
	//Para el valor 5 imprimimos suficiente
	case 2 -> {
		System.out.print("Martes");
	}
	//Para el valor 6 imprimimos bien
	case 3 -> {
		System.out.print("Miercoles");
	}
	//Para los valores del 7 al 8 imprimimos notable
	case 4 -> {
		System.out.print("Jueves");
	}
	//Para los valores del 9 al 10 imprimimos sobresaliente
	case 5 -> {
		System.out.print("Viernes");
	}
	case 6 -> {
		System.out.print("Sábado");
	}
	case 7 -> {
		System.out.print("Domingo");
	}
	default -> System.out.print("Valor incorrecto.");
}
	sc.close();
}}