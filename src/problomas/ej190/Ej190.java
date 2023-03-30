package problomas.ej190;
import java.util.Scanner;

public class Ej190 {
	public static long factorial(long num){
        if(num == divisor){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
	
	static long numCasos;
	static long divisor;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ej190 objeto = new Ej190();
		while (true) {
			numCasos = sc.nextInt();
			divisor = sc.nextInt();
			if (numCasos < divisor)
				break;
			
			System.out.println(factorial(numCasos));
		}
	}
}