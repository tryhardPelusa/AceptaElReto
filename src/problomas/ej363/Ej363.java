package problomas.ej363;
import java.util.Scanner;

public class Ej363 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		int numCalorias;
		int numComilonas;
		int totalCalorias = 0;
		int totalEntrenamientos = 1;
		int aux;
		while (true) {
			totalEntrenamientos = 1;
			totalCalorias = 0;
			numCalorias = sc.nextInt();
			if (numCalorias == 0)
				break;

			numComilonas = sc.nextInt();

			for (int i = 0; i < numComilonas; i++) {
				totalCalorias += sc.nextInt();
			}
			aux = numCalorias;
			while (numCalorias < totalCalorias) {
				totalEntrenamientos++;
				numCalorias += aux;
			}
			System.out.println(totalEntrenamientos);
		}

	}

}