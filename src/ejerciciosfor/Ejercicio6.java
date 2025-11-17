package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//Declaracion de variables
	int num=0;
	int cont;
	int fact = 1;
	int contSuspensos = 0;
	
	
	System.out.println("Introduce 5 calificaciones de alumnos: ");
	
	for (cont = 1; cont<=5; cont++) {
	 num = sc.nextInt();
		if (num<5) {
			contSuspensos += 1;
			//System.out.println("Hay " + contSuspensos + " suspensos");
		} else if (num>10) {
				System.out.println("Numero no valido, introduzca una nota del 1 al 10");
				num = sc.nextInt();
			}
		
		
		
	} 
		
	System.out.println("Hay " + contSuspensos + " suspensos");
	
	sc.close();
	
}
}