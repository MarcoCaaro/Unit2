package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaracion de la variable int a
		int a;
    // Declaracion de la variable int b
		int b;
    // Declaracion de la variable int c
		int c;

    // Declaracion de variable double del discriminante
		double discriminante;
		// Declaracion de variables double para la solucion1
		double sol1;
    // Declaracion de variables double para la solucion2
		double sol2;
		

		// Inicializamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el coeficiente a
		System.out.println("Introduce el valor a: ");
		// Leemos y guardamos el valor a
		a = sc.nextInt();

		// Solicitamos al usuario el coeficiente b
		System.out.println("Introduce el valor b: ");
		// Leemos y guardamos el valor b
		b = sc.nextInt();

		// Solicitamos al usuario el coeficiente c
		System.out.println("Introduce el valor c: ");
		// Leemos y guardamos el valor c
		c = sc.nextInt();

		// Calculamos el discriminante 
		discriminante = (b * b) - (4 * a * c);

		// Verificamos si el discriminante es positivo o no
		if (discriminante > 0) {

			// Calculamos la primera solución usando la fórmula cuadrática
			sol1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			// Calculamos la segunda solución usando la fórmula cuadrática
			sol2 = (-b - Math.sqrt(discriminante)) / (2 * a);

			// Mostramos la primera solución
			System.out.println("Primera solución: " + sol1);
			// Mostramos la segunda solución
			System.out.println("Segunda solución: " + sol2);

		}

		// Verificamos si el discriminante es cero (solución doble)
		if (discriminante == 0) {

			// Calculamos la solución única (doble)
			sol1 = -b / (2.0 * a);

			// Mostramos la solución doble
			System.out.println("El ejercicio posee una solución doble: " + sol1);

		}

		// Verificamos si el discriminante es negativo (sin soluciones reales)
		if (discriminante < 0) {

			// Informamos que no hay soluciones reales
			System.out.println("El ejercicio no tiene soluciones reales");

		}

	}
}
