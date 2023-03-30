package problomas.ej616;
import java.util.Scanner;

public class Ej616 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos el objeto
		Ej616 objeto = new Ej616();
		// Pedimos el numero de casos

		int numCasos = objeto.getNumCasos();
		// Creamos el caso de prueba
		while (numCasos != 0) {
			objeto.casoDePrueba(numCasos);
			numCasos = objeto.getNumCasos();
		}

	}

	public int getNumCasos() {
		int numCasos = sc.nextInt();

		return numCasos;
	}

	public void casoDePrueba(int numCasos) {
		int izq = 0;
		int der = 0;
		boolean ganaIz = true;
		String sonido;
		for (int i = 0; i < numCasos; i++) {
			sonido = sc.next();
			if (sonido.equals("PIC")) {
				ganaIz = !ganaIz;
			}
			if (sonido.equals("PONG!")) {
				if (ganaIz) {
					izq++;
					ganaIz = true;
				} else {
					der++;
					ganaIz = false;
				}
			}
		}
		System.out.println(izq + " " + der);
	}
}