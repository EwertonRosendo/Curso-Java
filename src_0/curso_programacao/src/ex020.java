import java.util.Locale;
import java.util.Scanner;

public class ex020 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas: ");
		int m = sc.nextInt();

		System.out.println("Quantidade de colunas: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int c = 0; c < n; c++) {
				System.out.printf("mat[%d][%d]: ", i, c);
				mat[i][c] = sc.nextInt();
			}
		}
		System.out.println("Informe um numero: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int c = 0; c < mat[i].length; c++) {
				if (mat[i][c] == x) {
					if (c > 0) {
						System.out.println("Left: " + mat[i][c - 1]);

					}

					if (i > 0) {
						System.out.println("Top: " + mat[i - 1][c]);

					}
					
					if (c < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][c + 1]);
					}
					
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][c]);
						
					}
				}

			}
		}

		sc.close();
	}

}
