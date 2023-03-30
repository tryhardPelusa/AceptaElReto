package problomas.ej661;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Tesoro implements Comparable<Tesoro> {
	// Atributos
	public String nombre;
	public int valor;
	public int peso;

	// Constructor
	public Tesoro(String nombre, int valor, int peso) {
		this.nombre = nombre;
		this.valor = valor;
		this.peso = peso;
	}

	@Override
	public int compareTo(Tesoro t) {
		if (this.valor != t.valor) {
			return t.valor - this.valor;
		}

		if (this.peso != t.peso) {
			return this.peso - t.peso;
		}
		return 0;
	}

}

public class Ej661 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		ArrayList<Tesoro> tesoros = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while (true) {
			numCasos = sc.nextInt();
			sc.nextLine();
			if (numCasos == 0)
				break;
			for (int i = 0; i < numCasos; i++) {
				Tesoro t = new Tesoro(sc.next(), sc.nextInt(), sc.nextInt());
				tesoros.add(t);
			}

			Collections.sort(tesoros);

			for (int i = 0; i < tesoros.size(); i++) {
				sb.append(tesoros.get(i).nombre);
				if (i + 1 != numCasos) {
					sb.append(" ");
				}
			}

			System.out.println(sb.toString());
			tesoros.clear();
			sb.delete(0, sb.length());
		}
	}

}