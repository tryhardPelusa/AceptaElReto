package problomas.ej365;
import java.util.Scanner;

public class Ej365 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			int numCrios = sc.nextInt();
			int posAitor = sc.nextInt();
			int numRegalos[] = new int[numCrios];
			for (int j = 0; j < numCrios; j++) {
				numRegalos[j] = sc.nextInt();
			}

			int minutos = 0;
			boolean isRegalos = true;
			for (int k = 0; k < numRegalos.length || isRegalos; k++) {
				
				for (int j = 0; j < numRegalos.length && isRegalos; j++) {
					if (numRegalos[j] > 0) {
						minutos += 2;
						numRegalos[j]--;
					}
					isRegalos = false;
					for (int j2 = 0; j2 < numRegalos.length; j2++) {
						if (numRegalos[j2] != 0) {
							isRegalos = true;
						}
					}
					if (numRegalos[posAitor - 1] == 0) {
						isRegalos = false;

					}
					
				}
			}
			System.out.println(minutos);

		}

	}
}