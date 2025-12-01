package bucles;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	int numMenor = 0;
	System.out.println("Introduce dos numero aleatorios");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	if(num1<num2) {
		numMenor=num1;
	} else if ( num2<num1 ) {
		numMenor=num2;	
	}
	
	for ( int contador = numMenor; contador>=0; contador--) {
		if (num1 % contador == 0 && num2 % contador == 0) {
			System.out.println(contador);
			break;
		}
		
		
	}
	
	sc.close();
	
	}
	
	
}