package problomas.ej141;
import java.util.Scanner;
import java.util.Stack;

public class Ej141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			// Declaramos
			String linea = sc.nextLine();
			char[] caracteres = linea.toCharArray();
			char comprobar;
			Stack<Character> pila = new Stack<>();
			boolean isCorrecto = true;

			// Sacamos uno a uno los caracteres
			for (int i = 0; i < caracteres.length && isCorrecto; i++) {
				if (caracteres[i] == '(' || caracteres[i] == '[' || caracteres[i] == '{') {
					pila.add(caracteres[i]);
				} else if (caracteres[i] == ')' || caracteres[i] == ']' || caracteres[i] == '}') {
					if (pila.isEmpty()) {
						isCorrecto = false;
					} else {
						comprobar = pila.pop();
						switch (comprobar) {
						case '(':
							if (caracteres[i] != ')') {
								isCorrecto = false;
							}
							break;
						case '[':
							if (caracteres[i] != ']') {
								isCorrecto = false;
							}
							break;
						case '{':
							if (caracteres[i] != '}') {
								isCorrecto = false;
							}
							break;

						default:
							isCorrecto = false;
							break;
						}
					}
				}
			}
			if (!pila.isEmpty()) {
				isCorrecto = false;
			}
			
			// Imprimimos resultados
			if (isCorrecto) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			pila.clear();
		}

	}
}