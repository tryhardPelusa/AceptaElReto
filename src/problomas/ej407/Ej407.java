package problomas.ej407;
import java.util.Scanner;

public class Ej407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casillas;
		int posicion;
		int tirada;
		while (true) {
			casillas = sc.nextInt();
			posicion = sc.nextInt();
			tirada = sc.nextInt();
			if (casillas == 0 && posicion == 0 && tirada == 0)
				break;
			
			if (posicion + tirada < casillas) {
				posicion += tirada;
			} else {
				int diferencia = casillas - posicion;
				posicion = casillas - (tirada - diferencia);
			}
			System.out.println(posicion);

		}
	}

}