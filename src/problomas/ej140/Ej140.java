package problomas.ej140;
import java.util.Scanner;
import java.util.Stack;

public class Ej140 {
	public static void main(String[] args) {
		// Declaramos el scanner y el caso de prueba
		Scanner sc = new Scanner(System.in);
		int numCasos;

		// Comprobamos si hay que realizar el caso de prueba
		while (true) {
			numCasos = sc.nextInt();
			// Rompemos el while en caso de que el caso de prueba no deba ejecutarse
			if (numCasos < 0)
				break;

			// Declaramos el resto de estructuras necesarias
			Stack<Integer> digitos = new Stack<>();
			int digito = 0, suma = 0;
			boolean isprimero = true;

			while (numCasos > 0 || isprimero) {
				digito = numCasos % 10;
				digitos.push(digito);
				numCasos /= 10;
				suma += digito;
				isprimero = false;
			}

			for (int i = 0; i < digitos.size() - 1; i++) {
				System.out.print(digitos.pop() + " + ");
				i--;
			}

			System.out.println(digitos.pop() + " = " + suma);

		}
	}
}