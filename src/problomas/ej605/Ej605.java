package problomas.ej605;
import java.util.Scanner;

public class Ej605 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean juega = true;

        while(juega) {
            String entrada = sc.nextLine();
            if(entrada.length()==1 && entrada.equals(".")) {
                juega = false;
            } else {
                int verano = 0;
                int invierno = 0;
                for(int i = 0; i<entrada.length()-1; i++) {
                    if (entrada.substring(i,i+1).equals("V")) {
                        verano++;
                    } else if (entrada.substring(i,i+1).equals("I")) {
                        invierno++;
                    } 
                }
                if(verano>invierno) {
                    System.out.println("VERANO");
                } else if (verano<invierno) {
                    System.out.println("INVIERNO");
                } else {
                    System.out.println("EMPATE");
                } 
            }
        }
    }
}