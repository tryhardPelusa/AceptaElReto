package problomas.ej520;
import java.util.Scanner;

public class Ej520 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVasos, posicion, vaso1, vaso2;
		while (true) {
			numVasos = sc.nextInt();
			posicion = sc.nextInt();
			if (numVasos == 0 && posicion == 0)
				break;

			while (true) {
				vaso1 = sc.nextInt();
				vaso2 = sc.nextInt();
				if (vaso1 == 0)
					break;
				if (vaso1 == posicion) {
					posicion = vaso2;
				} else if (vaso2 == posicion) {
					posicion = vaso1;
				}
			}

			System.out.println(posicion);

		}
	}
}