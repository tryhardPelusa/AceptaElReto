package problomas.ej238;
import java.util.Scanner;

public class Ej238 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int billetes[], bandidos[];
		String resultados[];
		while (true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 == 0 && num2 == 0)
				break;
			billetes = new int[num1];
			bandidos = new int[num2];
			resultados = new String[num2];
			for (int i = 0; i < billetes.length; i++) {
				billetes[i] = sc.nextInt();
			}

			for (int i = 0, j = 0; i < bandidos.length; i++, j++) {
				if (j < billetes.length) {
					bandidos[i] += billetes[j];
					resultados[i] += " " + billetes[j];
				}
				if (i == bandidos.length - 1 && j < billetes.length) {
					i = -1;
				}
			}

			for (int i = 0; i < resultados.length; i++) {
				if (resultados[i] != null) {
					System.out.println(bandidos[i] + ":" + resultados[i].substring(4));
				} else {
					System.out.println(bandidos[i] + ":");
				}
			}
			System.out.println("---");
		}
	}
}