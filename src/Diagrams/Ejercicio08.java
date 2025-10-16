package Diagrams;

import java.util.Scanner;

public class Ejercicio08 {
public static void main(String[] args) {
	
	//Inicializamos el scanner
	Scanner sc = new Scanner (System.in);
	
	//Declaramos la variable entera del primer numero
	int num1;
	//Declaramos la variable entera del segundo numero
	int num2;
	//Declaramos la variable entera del tercer numero
	int num3;
	//Declaramos la variable del numero mayor
	int mayor;
	
	//Imprimimos la peticion
	System.out.print("Introduce 3 numeros: ");
	
	//recogemos los numeros en el scanner
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	
	//Comenzamos el condicional
	if(num1>num2) {
		mayor=num1;
	}
	else { mayor=num2;
		}
	//Establecemos el segundo condicional
	if(mayor>num3) {
		System.out.print("El mayor numero es " + mayor);
	}
	else { System.out.print("El mayor numero es " + num3);
	}
	sc.close();
	}
}
	
		
	
	
		
	


