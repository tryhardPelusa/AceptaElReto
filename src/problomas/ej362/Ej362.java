package problomas.ej362;
import java.util.Scanner;

public class Ej362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = sc.nextInt();
		int num1, num2;
		for (int i = 0; i < numCasos; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 == 25 && num2 == 12) {
				System.out.println("SI");

			} else {
				System.out.println("NO");
			}

		}

	}

}