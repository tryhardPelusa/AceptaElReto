package problomas.ej366;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ninyo implements Comparable<Ninyo>{
	public int bueno, peso;

	public Ninyo(int bueno, int peso) {
		this.bueno = bueno;
		this.peso = peso;
	}

	@Override
	public int compareTo(Ninyo o) {
		if (this.bueno != o.bueno) {
			return o.bueno - this.bueno;
		}
		if (this.peso != o.peso) {
			return this.peso - o.peso;
		}
		return 0;
	}
	
}

public class Ej366 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCrios;
		ArrayList<Ninyo> ninyos = new ArrayList<>();
		while (true) {
			numCrios = sc.nextInt();
			sc.nextLine();
			// Comprueba si hay que seguir
			if (numCrios == 0) {
				break;
			}
			// Introducimos los ninyos en el array
			for (int i = 0; i < numCrios; i++) {
				Ninyo n = new Ninyo(sc.nextInt(), sc.nextInt());
				ninyos.add(n);
			}
			Collections.sort(ninyos);
			for (int i = 0; i < numCrios; i++) {
				System.out.println(ninyos.get(i).bueno + " " + ninyos.get(i).peso);
			}
			System.out.println();
			ninyos.clear();
			
		}
	}
}