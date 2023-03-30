package problomas.ej615;
import java.util.Scanner;

public class Ej615 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos el objeto
		Ej615 objeto = new Ej615();
		// Pedimos el numero de casos de prueba
		int numCasos = objeto.getNumCasos();
		// Creamos un bucle con el numero de casos que introduce el usuario
		for (int i = 0; i < numCasos; i++) {
			// Pedimos los datos al usuario
			int numPasos = objeto.getNumPasos();
			int numFactor = objeto.getNumFactor();
			int numTiempo = objeto.getNumTiempo();
			// Creamos el caso de prueba
			int numPotencia = objeto.getNumPotencia(numPasos, numFactor, numTiempo);
			// Imprimimos resultados
			System.out.println(numPotencia);

		}

	}

	public int getNumCasos() {
		int numCasos;
		numCasos = sc.nextInt();
		return numCasos;
	}

	public int getNumPasos() {
		int numPasos;
		numPasos = sc.nextInt();
		return numPasos;
	}

	public int getNumFactor() {
		int numFactor;
		numFactor = sc.nextInt();
		return numFactor;
	}

	public int getNumTiempo() {
		int numTiempo;
		numTiempo = sc.nextInt();
		return numTiempo;
	}

	public int getNumPotencia(int numPasos, int numFactor, int numTiempo) {
		int numPotencia;
		if (numPasos >= numTiempo) {
			numPotencia = numTiempo * numFactor;
		} else {
			while (numPasos < numTiempo) {
				numTiempo = numTiempo - numPasos - 1;
			}
			numPotencia = numTiempo * numFactor;
		}
		return numPotencia;
	}

}