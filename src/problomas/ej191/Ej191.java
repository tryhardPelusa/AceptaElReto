package problomas.ej191;
import java.util.Scanner;

public class Ej191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {

			int numAcuarios = sc.nextInt(), maxLitros = sc.nextInt(), difLitros = sc.nextInt();
			int total = 0;

			for (int j = 0; j < numAcuarios; j++) {
				total += maxLitros;
				maxLitros -= difLitros;
			}
			System.out.println(total);

		}
	}
}
