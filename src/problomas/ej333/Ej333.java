package problomas.ej333;
import java.util.Scanner;

public class Ej333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		while (true) {
			numCasos = Integer.parseInt(sc.nextLine());
			if (numCasos == 0)
				break;
			boolean isCapicua = false;
			String valor = "";
			String cap1 = "";
			String cap2= "";
			valor += numCasos;
			for (int i = 1; i < valor.length(); i++) {
				cap1 = valor.substring(0, i);
				StringBuilder sb = new StringBuilder(cap1);
				sb.reverse();
				String cap1Comp = sb.toString();
				if (cap1.equals(cap1Comp)) {
					cap2 = valor.substring(i, valor.length());
					String comprobar = cap2;
					int sin0 = Integer.parseInt(cap2);
					cap2 = "";
					cap2 += sin0;
					if (cap2.equals(comprobar)) {
						
						StringBuilder sb2 = new StringBuilder(cap2);
						sb2.reverse();
						String cap2Comp = sb2.toString();
						if (cap2.equals(cap2Comp)) {
							isCapicua = true;
							break;
						}
					}
				}
				
			}
			
			System.out.println(isCapicua?"SI":"NO");
			
		}
	}
}