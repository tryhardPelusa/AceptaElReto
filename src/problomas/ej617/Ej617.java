package problomas.ej617;
import java.util.Scanner;

public class Ej617 {
	Scanner sc = new Scanner(System.in);
	static Ej617 objeto = new Ej617();

	public static void main(String[] args) {
		// Creamos el objeto
		// Pedir numero de casos de prueba
		int numCasos = objeto.getCasos();
		// Creamos el caso de prueba
		for (int i = 0; i < numCasos; i++) {
			int numRanking = objeto.getRanking();

			String mensaje = objeto.getMensaje(numRanking);
			System.out.println(mensaje);
		}
	}

	public int getCasos() {
		int numCasos = sc.nextInt();
		return numCasos;
	}

	public int getRanking() {
		int numRanking = sc.nextInt();
		return numRanking;
	}

	public String getNombre() {
		String nombre = sc.next();
		return nombre;
	}

	public String getMensaje(int numRanking) {
		String mensajeInicial = "";
		for (int i = 0; i < numRanking; i++) {
			mensajeInicial += objeto.getNombre();
		}
		String mensajeFinal = "";
		for (int i = 0; i < 3; i++) {
			int indice = i;
			for (int j = 1; j <= numRanking; j++) {
				mensajeFinal += mensajeInicial.charAt(indice);
				indice += 3;
			}
		}
		return mensajeFinal;
	}

}