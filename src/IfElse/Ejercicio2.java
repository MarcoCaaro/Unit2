package IfElse;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double num;
	System.out.print("Introduce un numero decimal: ");
	num = sc.nextDouble();
	if(num < 1 && num > -1) {
		System.out.print("El numero es casi cero.");
	}
	else if (num == 0 || num == 1 || num == -1) {
		System.out.print("El numero no es casi 0.");
	}
	else {System.out.print("El numero no es casi 0.");
	}
	}
}

