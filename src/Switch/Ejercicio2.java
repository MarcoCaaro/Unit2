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
	//Para el valor 1 imprimimos Lunes
	case 1 -> {
		System.out.print("Lunes.");
	}
	//Para el valor 2 imprimimos Martes
	case 2 -> {
		System.out.print("Martes.");
	}
	//Para el valor 3 imprimimos Miercoles
	case 3 -> {
		System.out.print("Miercoles.");
	}
	//Para el valor 4 imprimimos Jueves
	case 4 -> {
		System.out.print("Jueves.");
	}
	//Para el valor 5 imprimos viernes
	case 5 -> {
		System.out.print("Viernes.");
	}
	//Para el valor 6 imprimimos sabado
	case 6 -> {
		System.out.print("Sábado.");
	}
	//Para el valor 7 imprimimos domingo
	case 7 -> {
		System.out.print("Domingo.");
	}
	default -> System.out.print("Valor incorrecto.");
}
	sc.close();
}}