package problomas.ej623;
import java.util.Arrays;
import java.util.Scanner;

public class Ej623 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {

			int joker = sc.nextInt();
			int boleto = sc.nextInt();
			int jokerArr[] = new int[7];
			int boletoArr[] = new int[7];
			int contadorJ[] = new int[10];
			int contadorB[] = new int[10];

			for (int j = 0; j < jokerArr.length; j++) {
				jokerArr[j] = joker % 10;
				joker /= 10;
				boletoArr[j] = boleto % 10;
				boleto /= 10;
			}
			for (int j = 0; j < jokerArr.length; j++) {
				contadorJ[jokerArr[j]] += 1;
				contadorB[boletoArr[j]] += 1;
			}

			System.out.println(Arrays.equals(contadorJ, contadorB) ? "GANA" : "PIERDE");

		}

	}

}
