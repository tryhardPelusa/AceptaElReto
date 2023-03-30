package problomas.ej188;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej188 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos el Objeto
		Ej188 objeto = new Ej188();

		while (sc.hasNext()) {
			// Pedimos datos
			String cadena = objeto.pedirDatos();
			// Comprobamos si se han encadenado bien
			boolean isEncadenada = objeto.comprobarCadena(cadena);
			// Imprimimos resultados
			System.out.println(isEncadenada ? "SI" : "NO");
		}

	}

	// Este método pide un String al usuario
	public String pedirDatos() {
		String cadena = sc.nextLine();
		return cadena;
	}

	// Este método comprueba si las palabras están encadenadas
	public boolean comprobarCadena(String cadena) {
		StringTokenizer st = new StringTokenizer(cadena);
		StringBuilder sb1, sb2;
		String palabraAnterior;
		String palabraSiguiente;
		boolean isEncadenada = true;
		palabraAnterior = st.nextToken();
		while (st.hasMoreTokens()) {
			palabraSiguiente = st.nextToken();
			sb1 = new StringBuilder(palabraAnterior);
			sb1 = sb1.delete(0, sb1.length() - 2);

			sb2 = new StringBuilder(palabraSiguiente);
			sb2.delete(2, sb2.length());

			if (!sb1.toString().toLowerCase().equals(sb2.toString().toLowerCase())) {
				isEncadenada = false;
			}

			// Esto es para incrementar a la siguiente comprobación
			palabraAnterior = palabraSiguiente;
		}
		
		return isEncadenada;
	}

}