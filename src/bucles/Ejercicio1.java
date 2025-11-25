package bucles;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int horas;
	int minutos;
	int segundos;
	int sumaSegundos;
	
	System.out.println("Introduce una hora con sus minutos y sus segundos: ");
	System.out.println("Horas: ");
	horas = sc.nextInt();
	System.out.println("Minutos: ");
	minutos = sc.nextInt();
	System.out.println("Segundos: ");
	segundos = sc.nextInt();
	
	 System.out.println(horas + ":" + minutos + ":" + segundos);
	
	
	System.out.println("Ahora añada la cantidad de tiempo que quieres sumarle a esta hora en segundos: ");
	sumaSegundos = sc.nextInt();
	
	segundos = segundos + sumaSegundos;
	
	while (segundos>=60) {
		segundos -= 60;
		minutos++;
	}
	while (minutos>=60) {
		minutos -= 60;
		horas++;
	}
	while (horas>=24) {
		horas -= 24;
		
	}
	 System.out.println(horas + ":" + minutos + ":" + segundos);
	
	
	
	
}
	}
	


