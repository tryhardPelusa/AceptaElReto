package problomas.ej340;
import java.util.Scanner;

public class Ej340 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int cuadradosHorizontal = sc.nextInt(), cuadradosVertical = sc.nextInt();
            System.out.println(cuadradosHorizontal*(cuadradosVertical+1)+cuadradosVertical*(cuadradosHorizontal+1));
        }
    }
}