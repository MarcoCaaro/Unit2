package bucles;

import java.util.Scanner;

public class Ejercicio6Bien {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int lado;
	System.out.println("Introduce el tamaño del triangulo");
	lado = sc.nextInt();
	
	for (int fila = 1;fila<=lado;fila++){
		for (int col = 1;col<=(lado-fila);col++){
			System.out.print(" ");
			
		}
		for (int k=1 ; k <= fila ; k++) {
			if (fila != 1 && fila != lado && k != 1 && k != fila) {
				System.out.print("  ");
			} else { System.out.print("* ");
			
			}
		}
		
		System.out.println(" ");
			
			
		}
	} 
}
	

