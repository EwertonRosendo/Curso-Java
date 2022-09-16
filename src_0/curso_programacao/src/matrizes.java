import java.util.Locale;
import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero para a quantidade de linhas e de colunas: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Informe o numero: ");
				mat[i][j] = sc.nextInt();
			}
				
			
		}
		int count = 0;
		for(int i=0; i<n;i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
				System.out.print(mat[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("Diagonal principal");
		for(int i=0; i<n;i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				if(i==j) {
					
					System.out.print(mat[i][j] + " ");
				};
			}
		}
		System.out.println("negativos " + count);
		
		
		sc.close();
	}

}
