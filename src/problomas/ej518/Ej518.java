package problomas.ej518;
import java.util.Scanner;

public class Ej518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numCasos;
		int num1, num2;
		boolean isCorrecto;
		while (true) {
			numCasos = sc.next();
			if (numCasos.equals("0.00"))
				break;
			isCorrecto = true;
			num1 = Integer.parseInt(numCasos.substring(0, numCasos.length() - 3));
			num2 = Integer.parseInt(numCasos.substring(numCasos.length() - 2));

			switch (num1) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (num2 > 31 || num2 < 1) {
					isCorrecto = false;
				}
				break;
			case 2:
				if (num2 > 28 || num2 < 1) {
					isCorrecto = false;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (num2 > 30 || num2 < 1) {
					isCorrecto = false;
				}
				break;

			default:
				isCorrecto = false;
				break;
			}

			System.out.println(isCorrecto ? "SI" : "NO");

		}
	}
}