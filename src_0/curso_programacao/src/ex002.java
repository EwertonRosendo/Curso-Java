import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class ex002 {

	public static void main(String[] args) {
		double raio;
		double pi = 3.14159;
		
		Scanner input = new Scanner(System.in);
		System.out.println("informe o raio: ");
		raio = input.nextInt();
		
		Locale.setDefault(Locale.US);
		System.out.printf("A area é %.4f", pi*(Math.pow(raio, 2)));
		
		input.close();
		
		
	}

}
