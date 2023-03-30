package problomas.ej635;
import java.util.Scanner;

public class Ej365 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = sc.nextInt();
		sc.nextLine();
		int actual = 0;
		for (int i = 0; i < numCasos; i++) {
			actual = sc.nextInt();
			if (actual%100 == 0) {
				actual/=100;
			}else {
				actual /=100;
				actual++;
			}
			System.out.println(actual);
		}

	}

}