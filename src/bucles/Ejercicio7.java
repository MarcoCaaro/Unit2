package bucles;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int alt;
	System.out.println("Introduce el tamaño del cuadrado");
	alt = sc.nextInt();
	
	for (int i = 0; i<=alt ; i++){
		for (int j = 0; j<i ;j++){
			System.out.print(j+1);
		}
		System.out.println();
	}
	
	
}
}
