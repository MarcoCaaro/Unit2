package Diagrams;

import java.util.Scanner;

public class Ejercicio03 {
public static void main(String[] args) {
	//Declaramos la variable entera del numero 1
	int n1;
	
	//Declaramos la variable entera del numero 2
	int n2;
	
	//Declaramos la variable double de la suma
	double suma;
	
	//Declaramos la variable double de la resta
	double resta;
	
	//Declaramos la variable double de la multiplicacion
	double multiplicacion;
	
	//Declaramos la variable double de la division
	double division;
	
	//Inicializamos el Scanner
	Scanner sc = new Scanner (System.in);
	
	//Imprimimos la peticion de los dos numeros
	System.out.print("Introduce dos numeros: ");
	
	//Los leemos
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
	//Los calculos
	suma = n1 + n2;
	resta = n1 - n2;
	multiplicacion = n1 * n2;
	division = (double)n1 / n2;
	
	//Imprimimos los resultados
	System.out.println("El resultado de la suma es: " + suma);
	System.out.println("El resultado de la resta es: " + resta);
	System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
	
	//Establecemos la condicion y la contraparte
	if(n2==0) {
		System.out.print("No puedes introducir 0");
	}
	else { System.out.println("El resultado de la division es: " + division);	
	
	}
	sc.close();
	}

}