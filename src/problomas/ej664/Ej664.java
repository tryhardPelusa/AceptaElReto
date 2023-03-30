package problomas.ej664;
import java.util.Scanner;

public class Ej664 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		while (true) {

			
			int numPuentes = sc.nextInt();
			if (numPuentes == 0)
				break;

			int numCarril;
			int max[] = new int[numPuentes]; 
			int minMax = Integer.MAX_VALUE;
			for (int i = 0; i < numPuentes; i++) {
				numCarril = sc.nextInt();
				int altura[] = new int[numCarril];
				for (int j = 0; j < altura.length; j++) {
					altura[j] = sc.nextInt();
					if (altura[j] > max[i]) {
						max[i] = altura[j];
					}
				}

			}
			for (int j = 0; j < max.length; j++) {
				if (max[j] < minMax) {
					minMax = max[j];
				}
			}
			System.out.println(minMax);

		}

	}
}