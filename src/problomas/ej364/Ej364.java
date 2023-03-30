package problomas.ej364;
import java.util.Scanner;

public class Ej364 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos objeto
		Ej364 objeto = new Ej364();
		// Pedimos datos
		boolean repetir = true;
		String caso = "";
		do {
			caso = pedirDatos(caso);
			if (caso.equals("FIN")) {
				repetir = false;
			}else {
				caso = encriptarMensaje(caso);
				System.out.println(caso);
			}

		} while (repetir);

	}

	public static String pedirDatos(String cadena) {
		cadena = sc.nextLine();
		return cadena;
	}
	
	public static String encriptarMensaje(String cadena) {
		StringBuilder sb = new StringBuilder(cadena);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != 32) {
				if (sb.charAt(i) == 90) {
					sb.setCharAt(i, 'A'); ;
				}else {
					sb.setCharAt(i, (char) ((char) sb.charAt(i) + 1));
				}
			}
			cadena = sb.toString();
		}
		
		return cadena;
	}

}