package problomas.ej665;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej665 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			String ver1 = sc.next();
			String ver2 = sc.next();
			StringTokenizer st = new StringTokenizer(ver1, ".");
			StringTokenizer st2 = new StringTokenizer(ver2, ".");
			int v1[] = new int[3];
			int v2[] = new int[3];
			for (int j = 0; j < v2.length; j++) {
				v1[j] = Integer.parseInt(st.nextToken());
				v2[j] = Integer.parseInt(st2.nextToken());
			}
			boolean siguiente = false;
			if (v1[0]== v2[0]-1 && v2[1] == 0 && v2[2] == 0) {
				siguiente = true;
			} else if (v1[0]==v2[0] && v1[1] == v2[1]-1 && v2[2] == 0){
				siguiente = true;
			}else if(v1[0]==v2[0] && v2[1] == v1[1] && v1[2] == v2[2] - 1) {
				siguiente = true;
			}
			if (siguiente) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}
}