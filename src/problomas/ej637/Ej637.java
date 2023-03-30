package problomas.ej637;
import java.util.HashMap;
import java.util.Scanner;

public class Ej637 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		String linea;
		char caracter[];
		int suma = 0;
		numCasos = sc.nextInt();
		sc.nextLine();
		HashMap<Character, Integer> codigos = new HashMap<>();
		codigos.put('A', 5);
		codigos.put('B', 9);
		codigos.put('C', 11);
		codigos.put('D', 7);
		codigos.put('E', 1);
		codigos.put('F', 9);
		codigos.put('G', 9);
		codigos.put('H', 7);
		codigos.put('I', 3);
		codigos.put('J', 13);
		codigos.put('K', 9);
		codigos.put('L', 9);
		codigos.put('M', 7);
		codigos.put('N', 5);
		codigos.put('O', 11);
		codigos.put('P', 11);
		codigos.put('Q', 13);
		codigos.put('R', 7);
		codigos.put('S', 5);
		codigos.put('T', 3);
		codigos.put('U', 7);
		codigos.put('V', 9);
		codigos.put('W', 9);
		codigos.put('X', 11);
		codigos.put('Y', 13);
		codigos.put('Z', 11);
		codigos.put('!', 19);
		codigos.put('?', 15);
		for (int i = 0; i < numCasos; i++) {
			linea = sc.nextLine();
			caracter = linea.toCharArray();
			for (int j = 0; j < caracter.length; j++) {
				if (j < caracter.length - 1 && caracter[j] != ' ') {
					suma += codigos.get(caracter[j]);
					suma += 3;
				} else if (caracter[j] == ' ') {
					suma += 2;
				} else {
					suma += codigos.get(caracter[j]);
				}
			}
			System.out.println(suma);
			suma = 0;

		}

	}
}