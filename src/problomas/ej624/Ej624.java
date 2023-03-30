package problomas.ej624;
import java.util.HashSet;
import java.util.Scanner;

public class Ej624 {

	public static void main(String[] args) {
		// Creamos el scanner y la variable que almacenará el numero de calcetines
		Scanner sc = new Scanner(System.in);
		int numCalcetines;
		// Comprobamos que haya que realizar o no el caso continuando en caso de que sea
		// distinto de 0
		while (true) {
			numCalcetines = sc.nextInt();
			int calcetin = 0;
			int contador = 0;
			if (numCalcetines == 0)
				break;

			HashSet<Integer> calcetines = new HashSet<>();
			for (int i = 0; i < numCalcetines; i++) {
				calcetin = sc.nextInt();
				if (!calcetines.contains(calcetin)) {
					calcetines.add(calcetin);
					if (contador < calcetines.size()) {
						contador = calcetines.size();
					}
				} else {
					calcetines.remove(calcetin);
				}
			}
			System.out.println(contador);
			calcetines.clear();

		}

	}

}