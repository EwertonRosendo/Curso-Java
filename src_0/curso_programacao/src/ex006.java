import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class ex006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		System.out.printf("Triangulo: %.2f %n", ((a*c)/2));
		System.out.printf("circulo: %.2f %n", (3.14159*Math.pow(c, 2)));
		System.out.printf("Trapezio: %.2f %n", ((a+b)*c)/2);
		System.out.printf("Quadrado: %.2f %n", Math.pow(b, 2));
		System.out.printf("Retangulo: %.2f %n", (a*b));
		
		
		input.close();

	}

}
