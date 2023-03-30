package problomas.ej455;
import java.util.Scanner;

public class Ej455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // número de casos de prueba
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // porcentaje multiplicado por 100
            int size = 1;
            while (size <= 10000 && p * size % 10000 != 0) {
                size++;
            }
            System.out.println(size);
        }
    }
}