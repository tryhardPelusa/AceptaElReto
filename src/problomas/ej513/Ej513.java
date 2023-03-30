package problomas.ej513;
import java.util.Scanner;

public class Ej513 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numDias;
		int patentes[];
		int totalPatentes;
		while (sc.hasNext()) {
			totalPatentes = 0;
			numDias = sc.nextInt();
			patentes = new int[numDias];
			for (int i = 0; i < numDias; i++) {
				patentes[i] = sc.nextInt() * (i + 1) - totalPatentes;
				totalPatentes += patentes[i];
			}
			for (int i = 0; i < patentes.length - 1; i++) {
				System.out.print(patentes[i] + " ");
			}
			System.out.println(patentes[patentes.length - 1]);
		}

	}
}