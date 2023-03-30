package problomas.ej239;
import java.util.Scanner;

public class Ej239 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias, emisoras, totalSeg;
		String d, h, m, s;
		while (true) {
			d = "";
			h = "";
			m = "";
			s = "";
			dias = sc.nextInt();
			emisoras = sc.nextInt();
			if (dias == 0 && emisoras == 0)
				break;

			totalSeg = dias * 24 * emisoras * 6;
			s += totalSeg % 60;
			totalSeg /= 60;
			m += totalSeg % 60;
			totalSeg /= 60;
			h += totalSeg % 24;
			totalSeg /= 24;
			d += totalSeg;
			if (s.length() < 2) {
				s = "0" + s;
			}
			if (m.length() < 2) {
				m = "0" + m;
			}
			if (h.length() < 2) {
				h = "0" + h;
			}
			if (d.length() < 2) {
				d = "0" + d;
			}
			System.out.println(totalSeg + ":" + h + ":" + m + ":" + s);
		}
	}
}