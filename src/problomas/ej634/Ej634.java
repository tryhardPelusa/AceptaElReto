package problomas.ej634;
import java.util.Scanner;

public class Ej634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = sc.nextInt();
		sc.nextLine();
		String completo;
		char actual[];
		int puntuar, total;
		for (int i = 0; i < numCasos; i++) {
			puntuar = 10;
			total = 0;
			completo = sc.nextLine();
			actual = completo.toCharArray();
			for (char c : actual) {
				if (c == 'O') {
					total += puntuar;
					puntuar += 10;
				} else {
					puntuar = 10;
				}
			}
			System.out.println(total);
		}

	}
}