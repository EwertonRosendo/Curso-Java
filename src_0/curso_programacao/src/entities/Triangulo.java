package entities;
import java.util.Locale;
import java.util.Scanner;


public class Triangulo {
	public double a;
	public double b;
	public double c;
	double p;
	
	public double area() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("\nInforme os 3 lados: \n");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		p = (a + b + c) / 2;
		double resul = Math.sqrt((p * (p - a) * (p - b) * (p -c)));
		return resul;
	}
	

}
