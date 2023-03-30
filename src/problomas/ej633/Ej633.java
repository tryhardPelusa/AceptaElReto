package problomas.ej633;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos, sobrantes;
        Set<String> animales, completas;
        String actual, frase;
        while (true) {
            numCasos = sc.nextInt();
            if (numCasos == 0) break;

            sc.nextLine();  // para consumir el salto de línea después del número

            animales = new HashSet<>();
            completas = new HashSet<>();
            sobrantes = 0;

            frase = sc.nextLine();
            String[] palabras = frase.split(" ");
            for (String palabra : palabras) {
                actual = palabra;
                String raiz = actual.substring(0, actual.length() - 1);
                char terminacion = actual.charAt(actual.length() - 1);
                if (animales.contains(actual) || completas.contains(raiz)) {
                    sobrantes++;
                } else {
                    if (terminacion == 'a' && !animales.contains(raiz + "o")) {
                        animales.add(actual);
                    } else if (terminacion == 'a') {
                        animales.remove(raiz + "o");
                        completas.add(raiz);
                    } else if (!animales.contains(raiz + "a")) {
                        animales.add(actual);
                    } else {
                        animales.remove(raiz + "a");
                        completas.add(raiz);
                    }
                }
            }
            System.out.println(completas.size() + " " + animales.size() + " " + sobrantes);
        }
        sc.close();
    }
}