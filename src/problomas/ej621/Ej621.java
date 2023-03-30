package problomas.ej621;
import java.util.Scanner;

public class Ej621 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			int pagina = sc.nextInt();
			
			if (pagina%2 == 0) {
				System.out.println(pagina+1);
			}else {
				System.out.println(pagina-1);
			}
		}

	}
}