import java.util.Locale;
import java.util.Scanner;

public class aulavetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a quantidade de pessoas: ");
		int n = input.nextInt();
		double soma = 0;
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			
			System.out.printf("Informe a altura da pessoa %d ", i);
			vect[i] = input.nextDouble();
			soma = soma+vect[i];
		}

		input.close();
		
		System.out.printf("A media de altura das %d pessoas é %.2f", n, soma/n);
	}

}
