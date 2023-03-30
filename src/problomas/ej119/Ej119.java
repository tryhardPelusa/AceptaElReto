package problomas.ej119;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		while (true) {
			numCasos = Integer.parseInt(sc.nextLine());
			if (numCasos == 0)
				break;

			ArrayList<Integer> cuadrados = new ArrayList<>();
			for (int i = 1; i <= numCasos; i++) {
				if (i * i > numCasos && i != 1) {
					cuadrados.add(i - 1);
					numCasos -= ((i-1) * (i-1));
					i = 0;
				} else if (i == 1 && i * i == numCasos ) {
					cuadrados.add(i);
					numCasos -= (i * i);
				}
			}

			int escudos = 0;
			for (Integer integer : cuadrados) {
				if (integer != 1) {
					escudos += (integer * integer);
					escudos += integer * 4;
				} else {
					escudos += 5;
				}
			}

			System.out.println(escudos);
			cuadrados.clear();
		}
	}
}