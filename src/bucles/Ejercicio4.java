package bucles;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	int numMayor = 0;
	int contador = 0;
	int mcm = 1;
	System.out.println("Introduce dos numero aleatorios");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	if(num1<num2) {
		numMayor=num2;
	} else if ( num2<num1 ) {
		numMayor=num1;	
	}
	
	 while (mcm % num1 != 0 || mcm % num2 != 0) { 
		 {
			mcm++;
		}
		
	}
	 System.out.println(mcm);
		
		
	
	
	sc.close();
	
	}
	
	
}
	


		