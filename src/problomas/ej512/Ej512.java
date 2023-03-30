package problomas.ej512;
import java.util.Scanner;

public class Ej512 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ej512 objeto = new Ej512();
		int numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			objeto.casoDePrueba();
		}

	}

	public void casoDePrueba() {
		int kgConejo, kgCaballo, porcentaje;
		kgConejo = sc.nextInt();
		kgCaballo = sc.nextInt();
		porcentaje = (kgConejo * 100) / (kgCaballo + kgConejo);
		System.out.println(porcentaje);

	}

}