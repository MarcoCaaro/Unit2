package bucles;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int lado;
	System.out.println("Introduce el tamaño del triangulo");
	lado = sc.nextInt();
	
	for (int fila = 1;fila<=lado;fila++){
		for (int columna = 1;columna<=lado;columna++){
			if (fila != 1 && fila != lado && columna != 1 && columna != lado) {
				System.out.print("  ");
			} else {
				System.out.print("* ");
			}
			
			
			
			
		}
		System.out.println(" ");
	}
	
}
}
