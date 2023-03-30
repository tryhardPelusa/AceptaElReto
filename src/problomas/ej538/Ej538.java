package problomas.ej538;
import java.util.Scanner;

public class Ej538 {
	public static boolean casoDePrueba(Scanner in) {

		int n = in.nextInt();
		int n2 = in.nextInt();
		if (n == 0 && n2 == 0)
			return false;
		if ((n - n2) >= 0)
			System.out.println("CUERDO");
		else
			System.out.println("SENIL");
		return true;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (casoDePrueba(in))
			;

	}
}