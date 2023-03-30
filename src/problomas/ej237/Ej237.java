package problomas.ej237;
import java.util.Scanner;

public class Ej237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1;
		String longitud = "";
		boolean ispoli;
		while (sc.hasNext()) {
			ispoli = true;
			num1 = sc.nextLong();
			longitud = "" + num1;
			while (num1 > 0) {
				if (num1 % longitud.length() != 0) {
					ispoli = false;
					num1 = 0;
				} else {
					num1 /= 10;
					longitud = "" + num1;
				}
			}

			System.out.println(ispoli ? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
		}

	}
}