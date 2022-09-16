import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
import entities.Triangulo;
public class sem_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		double p;
		
		p = (x.a + x.b + x.c) / 2;
		double resul1 = Math.sqrt((p * (p - x.a) * (p - x.b) * (p - x.c)));
		System.out.printf("A area do PRIMEIRO é: %f", resul1);

		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		p = (y.a + y.b + y.c) / 2;
		double resul2 = Math.sqrt((p * (p - y.a) * (p - y.b) * (p - y.c)));
		System.out.printf("A area do SEGUNDO é: %f", resul2);
		

		if (resul1 > resul2) {
			System.out.println("O primeiro triangulo tem maior area");
		} else {
			System.out.println("O segundo triangulo tem maior area");
		}
		input.close();

	}

}
