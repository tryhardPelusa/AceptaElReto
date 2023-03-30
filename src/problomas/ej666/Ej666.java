package problomas.ej666;
import java.util.Scanner;

public class Ej666 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			String frase1 = sc.nextLine();
			String frase2 = sc.nextLine();
			frase1 = frase1.replace(",", "");
			frase1 = frase1.replace(" ", "");
			frase1 = frase1.replace(".", "");
			frase1 = frase1.replace(";", "");
			frase1 = frase1.replace(":", "");

			frase2 = frase2.replace(",", "");
			frase2 = frase2.replace(" ", "");
			frase2 = frase2.replace(".", "");
			frase2 = frase2.replace(";", "");
			frase2 = frase2.replace(":", "");

			if (frase2.equalsIgnoreCase(frase1)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}
}