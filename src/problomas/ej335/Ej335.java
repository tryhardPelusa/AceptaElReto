package problomas.ej335;
import java.util.Scanner;

public class Ej335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // cantidad de casos de prueba
        while (t-- > 0) {
            long n = sc.nextLong(); // altura de la pirámide
            long sum = 0; // variable para almacenar la suma de los números triangulares
            for (long k = 1; k <= n; k++) {
                sum += k*(k+1)/2; // fórmula cerrada para el k-ésimo número triangular
            }
            System.out.println(sum); // imprimir la cantidad de canicas necesarias
        }
        sc.close();
    }
}
