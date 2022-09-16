import java.util.Locale;
import java.util.Scanner;
import entities.Numeros;

public class ex015 {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe quantos numeros serão informados: ");
		int n = input.nextInt();

		Numeros[] vect = new Numeros[n];

		for (int i = 0; i < vect.length; i++) {

			input.nextLine();

			System.out.println("Informe um numero");
			double num = input.nextDouble();
			vect[i] = new Numeros(num);
		}
		
		for(int i=0; i<vect.length; i++){
			
			if (vect[i].getNumeros() <0) {
				System.out.println(vect[i].getNumeros());
			}
		}
		input.close(); 

	}

}
