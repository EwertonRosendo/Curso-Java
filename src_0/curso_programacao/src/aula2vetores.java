import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class aula2vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numero de produtos: ");
		int n = input.nextInt();
		
		Product[] vect = new Product[n];
		
		
		for(int i=0; i<vect.length;i++) {
			input.nextLine();
			
			System.out.println("Nome: ");
			String nome = input.nextLine();
			
			System.out.println("Preço: ");
			double preco = input.nextDouble();
			
			vect[i] = new Product(nome, preco);
		}
		double soma = 0;
		for (int i=0;i<vect.length; i++) {
			soma = soma + vect[i].getPreco();
			
		}
		System.out.printf("A media dos preços é %f", soma/vect.length);
		
		
		input.close();

	}

}
