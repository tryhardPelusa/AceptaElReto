package problomas.ej313;
import java.util.Scanner;

public class Ej313 {

	public void casoDePrueba(Scanner in) {

		int n = in.nextInt();
		int n2 = in.nextInt();
		if ((n + n2) >= 0)
			System.out.println("SI");
		else
			System.out.println("NO");
	}

	public static void main(String args[]) {
		Ej313 ejemplo = new Ej313();
		Scanner in = new Scanner(System.in);
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++)
			ejemplo.casoDePrueba(in);

	}

}