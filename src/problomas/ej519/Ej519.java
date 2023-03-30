package problomas.ej519;
import java.util.Scanner;

public class Ej519 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas;
		int columnas;
		int fAct, cAct;
		char[] movimientos;
		char[][] tablero;
		while (true) {
			filas = sc.nextInt();
			columnas = sc.nextInt();
			if (filas == 0 && columnas == 0)
				break;
			fAct = sc.nextInt();
			cAct = sc.nextInt();
			sc.nextLine();
			movimientos = sc.next().toCharArray();

			tablero = new char[filas * 2 + 1][columnas * 2 + 1];
			fAct = fAct * 2 - 1;
			cAct = cAct * 2 - 1;
			tablero[fAct][cAct] = 'O';
			for (int i = 0; i < movimientos.length - 1; i++) {
				switch (movimientos[i]) {
				case '1':
					fAct -= 1;
					cAct -= 1;
					if (tablero[fAct][cAct] != '/' && tablero[fAct][cAct] != 'X')
						tablero[fAct][cAct] = '\\';
					else
						tablero[fAct][cAct] = 'X';
					fAct -= 1;
					cAct -= 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '2':
					fAct -= 1;
					tablero[fAct][cAct] = '|';
					fAct -= 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '3':
					fAct -= 1;
					cAct += 1;
					if (tablero[fAct][cAct] != '\\' && tablero[fAct][cAct] != 'X')
						tablero[fAct][cAct] = '/';
					else
						tablero[fAct][cAct] = 'X';
					fAct -= 1;
					cAct += 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '4':
					cAct -= 1;
					tablero[fAct][cAct] = '-';
					cAct -= 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '6':
					cAct += 1;
					tablero[fAct][cAct] = '-';
					cAct += 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '7':
					fAct += 1;
					cAct -= 1;
					if (tablero[fAct][cAct] != '\\' && tablero[fAct][cAct] != 'X')
						tablero[fAct][cAct] = '/';
					else
						tablero[fAct][cAct] = 'X';
					fAct += 1;
					cAct -= 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '8':
					fAct += 1;
					tablero[fAct][cAct] = '|';
					fAct += 1;
					tablero[fAct][cAct] = 'O';
					break;

				case '9':
					fAct += 1;
					cAct += 1;
					if (tablero[fAct][cAct] != '/' && tablero[fAct][cAct] != 'X')
						tablero[fAct][cAct] = '\\';
					else
						tablero[fAct][cAct] = 'X';
					fAct += 1;
					cAct += 1;
					tablero[fAct][cAct] = 'O';
					break;

				}
			}

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (i == 0 && j == 0 || i == 0 && j == tablero[i].length - 1 || i == tablero.length - 1 && j == 0
							|| i == tablero.length - 1 && j == tablero[i].length - 1) {
						tablero[i][j] = '+';
					} else if (i == 0 | i == tablero.length - 1) {
						tablero[i][j] = '-';
					} else if (j == 0 || j == tablero[i].length - 1) {
						tablero[i][j] = '|';
					}else if(!"-|XO/\\".contains(Character.toString(tablero[i][j]))) {
						if (i%2==1 && j%2==1) {
							tablero[i][j] = '.';
						}else {
							tablero[i][j] = ' ';
						}
					}
				}

			}

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					System.out.print(tablero[i][j]);
				}
				System.out.println();
			}
		}
	}
}