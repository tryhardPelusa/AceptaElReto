package problomas.ej147;
import java.util.Scanner;

public class Ej147 {

	public static Scanner in = new Scanner(System.in);;

	public static void casoDePrueba() {

		int cerillasTotales = in.nextInt();
		int quitarCerillas = in.nextInt();
		int quitarCerillasJugador = 0;
		int multiplo = 0;
		int indice;

		// PARA GANAR EN EL JUEGO DE LA CERILLA DEBEMOS DEJARLE SIEMPRE AL CONTRARIO UN
		// MÚLTIPLO + 2 DE LAS CERILLAS MÁXIMAS QUE PUEDEN QUITARSE. COMO DEBEMOS DEJAR
		// LA ÚLTIMA CERILLA LA FORMULA QUEDARIA EN MÚLTIPLO + 1
		for (indice = 1; indice * quitarCerillas <= cerillasTotales; indice++)
			;
		indice--;
		if (cerillasTotales <= quitarCerillas + 1) {
			multiplo = 1;
		} else {
			while (1 + (quitarCerillas + 1) * indice >= cerillasTotales + 1) {
				indice--;
			}
			multiplo = 1 + (quitarCerillas + 1) * indice;
		}
		// Con la variable multiplo conseguimos el número que debemos dejarle siempre al
		// adversario. Por lo que si nosotros tenemos ese número, asumiremos que hemos
		// perdido.

		if (multiplo == cerillasTotales) {
			System.out.println("PIERDO");
		} else {
			// En este caso debemos restar las cerillasTotales al múltiplo obtenido, el
			// resultado será el número de cerillas que debemos quitar
			quitarCerillasJugador = cerillasTotales - multiplo;
			System.out.println(quitarCerillasJugador);
		}

	}

	public static void main(String args[]) {
		while (in.hasNext()) {
			casoDePrueba();
		}

	}
}