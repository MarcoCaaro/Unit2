package bucles;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	int numCifras = 1;
	System.out.println("Introduce un numero y te dire cuantos digitos tiene");
	num = sc.nextInt();
	
	while (num>=10) {
		num = num / 10;
		numCifras++;
		
	}
	System.out.println(numCifras);
	sc.close();
	}
}
