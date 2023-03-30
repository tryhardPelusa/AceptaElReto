package problomas.ej663;
import java.util.Scanner;

public class Ej663 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			int anno = sc.nextInt();
			if (anno>0) {
				System.out.println(anno-1);
			} else {
				System.out.println(anno);
			}
		}

	}
}