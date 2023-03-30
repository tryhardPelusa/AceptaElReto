package problomas.ej117;

import java.util.Scanner;

public class Ej117 {
	public static void main(String[] args) {
		// Declaramos el objeto Scanner y la variable a usar
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		// Ejecutamos n casos de prueba
		for (int i = 0; i < numCasos; i++) {
			// Leemos el mensaje de consola
			String mensaje = sc.nextLine();
			// Imprimimos el saludo
			System.out.printf("Hola, " + mensaje.substring(4) + ".");

		}

	}

}