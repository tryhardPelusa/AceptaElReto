package problomas.ej636;
import java.util.HashMap;
import java.util.Scanner;

public class Ej636 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			// Creamos el objeto para la Orientación a objetos
			Ej636 objeto = new Ej636();
			// Leemos el nominador y el denominador
			int nominador = objeto.getNumUsuario();
			int denominador = objeto.getNumUsuario();

			// Ahora voy a crear un método que sacará todos los decimales necesarios
			String resultado = objeto.casoDePrueba(nominador, denominador);
			// Imprimimos resultados
			System.out.println(resultado);
		}
	}

	// Este método resuelve el problema propuesto
	private String casoDePrueba(int nominador, int denominador) {
		// Creamos el map que usaremos para almacenar los nominadores de la división. En
		// el momento en el que encontremos un nominador igual, tendremos un número
		// periódico, por lo que usamos map para almacenar el índice de cada numerador
		HashMap<Integer, Integer> mapa = new HashMap<>();
		// Creamos un String en el que vamos a almacenar todos los decimales que vayamos
		// consiguiendo
		String decimales = "";
		// Creamos un índice que iremos almacenando como el valor del mapa del nominador
		// (clave del mapa)
		int indiceMapa = 0;
		// Por ultimo creamos una bandera que nos indicará si el numero es periodico y a
		// demás nos dirá en que posición empieza a serlo. Por eso es de tipo int. De
		// momento lo inicializamos en -1 indicando que el número no es periodico
		int isPeriodico = -1;

		// Ahora vamos a actualizar el nominador multiplicandolo por 10 para poder
		// obtener el siguiente nominador a travñes del modulo de la división entera
		nominador *= 10;

		// Creamos un bucle que sacará todos los decimales hasta que el resto de la
		// división sea 0 o hasta que tengamos el número periodico.
		// También le creamos una bandera para saber cuando salir de él
		boolean noHayPeriodico = false;
		while (!noHayPeriodico && isPeriodico == -1) {
			// Guardamos el decimal actual
			int decimalActual = nominador / denominador;
			// Actualizamos el nominador para su proxima ejecución. Por ejemplo si dividimos
			// 2*10/7 el resto sería 6, por lo tanto será el nuevo nominador, ya que para
			// sacar el proximo decimal deberíamos dividir 6*10/7
			nominador %= denominador;

			// Ahora comprobamos si el nuevo nominador se encuentra dentro del mapa. Ya que
			// en él vamos a almacenar todos los nominadores porque el map solo lo usaremos
			// para comprobar cúando empiezan a repetirse los nominadores que van a provocar
			// el número periodico.
			if (mapa.containsKey(nominador)) {
				// Si hemos entrado en éste if significa que ya tenemos el número periodico, por
				// lo tanto debemos almacenar a partir de qué decimal empieza a ser periodico
				isPeriodico = mapa.get(nominador);
				// Ahora debemos comprobar si el decimal actual es diferente al decimal en el
				// que empieza el periódico
				// COMPROBAR ESTE IF QUE SIGO SIN ENTENDERLO BIEN
				if (decimalActual != Character.getNumericValue(decimales.charAt(mapa.get(nominador)))) {
					// En este caso actualizamos la variable en la que almacenamos todos los
					// decimales
					decimales += decimalActual;
					isPeriodico++;
				}
			}

			// Aumentamos el string decimales con el actual
			decimales += decimalActual;

			// Salimos del bucle en caso de que el nominador sea 0
			if (nominador == 0) {
				noHayPeriodico = true;
			} else {
				// Añadimos al mapa el nominador y su indice que nos servirá pare tenerlos
				// ordenados
				mapa.put(nominador, indiceMapa);
				// Actualizamos el indice para almacenar en el map el siguiente decimal
				indiceMapa++;
				// Actualizamos el nominador * 10 para poder volver a hacer su división entera
				// en la siguiente ejecución
				nominador *= 10;
			}
		}

		// Inicializamos el resultado final como 0. que es el formato en el que debemos
		// imprimir los decimales
		String resultado = "0.";
		// Comprobamos si el resultado no es periodico
		if (isPeriodico == -1) {
			resultado += decimales;

		} else {
			// En caso de que si sea periodico vamos a recorrer el string de los decimales
			for (int i = 0; i < decimales.length() - 1; i++) {
				// Comprobamos en qué decimal empieza a ser periodico. Para ello usamos la
				// variable que usabamos tanto como bandera como índice.
				if (i == isPeriodico)
					// En el momento en el que empiece añadimos la barra
					resultado += "|";
				// Actualizamos con el nuevo decimal
				resultado += decimales.charAt(i);
			}
			// Al salir del for cerramos el periódico
			resultado += "|";
		}
		// Devolvemos el resultado para imprimirlo
		return resultado;
	}

	// Este método nos sirve para leer tanto el nominador como el denominador
	private int getNumUsuario() {
		int num = sc.nextInt();
		return num;
	}
}