package problomas.ej100;

import java.util.Arrays;
import java.util.Scanner;

public class Ej100 {
	public static void main(String[] args) {
		// Declaración de estructuras y variables a usar
		Scanner sc = new Scanner(System.in);
		int numCasos, num, contador, resta1, resta2;
		int digi[];
		// Lectura del número de casos a procesar
		numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			// Establecemos el contador a 0
			contador = 0;
			// Leemos el número del caso de prueba
			num = sc.nextInt();
			digi = new int[4];
			// En caso de que el número sea distinto de 6174 realizaremos la operación que
			// se comenta en el enunciado, siempre y cuando el contador no llegue a 8
			while (num != 6174 && contador <= 7) {
				// Guardamos los miles, las centenas, decenas y unidades por separado
				digi[0] = num % 10;
				num /= 10;
				digi[1] = num % 10;
				num /= 10;
				digi[2] = num % 10;
				num /= 10;
				digi[3] = num % 10;
				num /= 10;

				// Ordenamos el array
				Arrays.sort(digi);
				// Creamos los dos números y los restamos
				resta1 = digi[0] + digi[1] * 10 + digi[2] * 100 + digi[3] * 1000;
				resta2 = digi[3] + digi[2] * 10 + digi[1] * 100 + digi[0] * 1000;
				num = resta1 - resta2;
				// Aumentamos el contador
				contador++;
			}
			// Imprimimos el contador
			System.out.println(contador);
		}

	}
}
