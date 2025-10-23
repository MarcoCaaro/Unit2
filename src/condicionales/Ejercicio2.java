package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	
	//Inicializamos el scanner
	Scanner sc = new Scanner(System.in);
	
	//Declaramos la variable entera del numero
	int num;
	
	//Imprimimos la peticion
	System.out.println("Introduce un numero: ");
	
	//Recogemos el numero en el scanner
	num = sc.nextInt();
	
	//Creamos el ternario, si el numero es mayor que 0 (true) lo dejamos igual, si es menor que 0 (false) le cambiamos el signo
	num = num>0 ? num : -num;
	
	//Imprimimos el resultado
	System.out.println("El valor absoluto de su numero es: " + num);
	
	//Cerramos el scanner
	sc.close();
}

}
