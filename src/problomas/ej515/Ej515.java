package problomas.ej515;
import java.util.Scanner;

public class Ej515 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ej515 objeto = new Ej515();
		boolean continuar = true;
		while (continuar) {
			continuar = objeto.casoDePrueba();
		}

	}

	public boolean casoDePrueba() {
		boolean continuar = true;
		int totalVasos = sc.nextInt();
		if (totalVasos == 0) {
			continuar = false;
		} else {

			int hermano = 1, yo, contador = 0;
			while (totalVasos > 0) {
				totalVasos -= hermano;
				contador++;
				if (totalVasos % 2 == 0) {
					yo = 2;
				} else {
					yo = 1;
				}
				if (totalVasos > 0) {
					totalVasos -= yo;
					contador++;
				}
			}
			System.out.println(contador);
		}
		return continuar;
	}

}