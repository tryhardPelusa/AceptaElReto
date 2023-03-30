package problomas.ej402;
import java.util.Scanner;

public class Ej402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int totalPieces = scanner.nextInt();

            if (totalPieces == 0) {
                break;
            }

            int width = (int) Math.sqrt(totalPieces);
            int height;

            while (totalPieces % width != 0) {
                width--;
            }

            height = totalPieces / width;

            System.out.println(Math.max(width, height));
        }
    }
}