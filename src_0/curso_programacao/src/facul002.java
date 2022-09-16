import java.util.Locale;
import java.util.Scanner;

import entities.Area;
public class facul002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Area figura;
		
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Circunferencia");
		System.out.println("4 - Triangulo");
		
		int ask = sc.nextInt();
		
		if (ask ==1) {
			System.out.println("Lados do quadrado: ");
			double lado = sc.nextDouble();
			
			figura = new Area(lado);
			
			System.out.printf("Area do quadrado: %.2f", figura.quadrado());
		}else if(ask ==2) {
			System.out.println("Altura do retangulo: ");
			double altura = sc.nextDouble();
			System.out.println("Largura do retangulo: ");
			double largura = sc.nextDouble();
			
			figura = new Area(largura, altura);
			
			System.out.printf("Area do retangulo: %.2f", figura.retangulo());
			
		}else if(ask==3) {
			System.out.println("Raio: ");
			double raio = sc.nextDouble();
			
			figura = new Area(raio);
			
			System.out.printf("Area do circunferencia: %.2f", figura.circulo());
			
		}else if (ask==4){
			System.out.println("base do retangulo: ");
			double base = sc.nextDouble();
			System.out.println("altura do retangulo: ");
			double altura = sc.nextDouble();
			
			figura = new Area(base, altura);
			
			System.out.printf("Area do triangulo: %.2f", figura.triangulo());
			
		}else {
			System.out.println("Nenhuma opção escolhida");
			
		}
		
		// TODO Auto-generated method stub
		
		sc.close();
	}

}
