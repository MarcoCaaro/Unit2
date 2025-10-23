package condicionales;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//Inicializamos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable entera del numero a introducir
	int num;
	
	//Imprimimos la peticion
	System.out.println("Introduzca un numero entre 0 y 9999");
	
	//La recogemos en el scanner
	num = sc.nextInt();
	
	
	
	
	if(num>= 0 && num<10) {
		System.out.println("Numero capicúa.");
	} else if (num >= 10 && num < 100) {
		if (num / 10 == num % 10) {
			System.out.println("Numero capicúa."); 
		} else { 
			System.out.println("No capicua.");
		}
			
	} else if (num >= 100 && num < 1000)
		if (num / 100 == num % 10) {
			System.out.println("Número capicúa.");
		} else { 
			System.out.println("No es capicúa.");
		}
	else if (num >= 1000 && num < 10000)
		if (num / 1000 == num % 10 && (num / 100) % 10 == (num / 10) % 10) {
			System.out.println("Número capicúa.");
		} else { System.out.println("No es capicúa."); 
		}
				sc.close();
			}
		
}
		
	


