import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class ex017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int idade = 0;
		double altura;
		String nome;
		double soma = 0;  
		double somaidade = 0;
		System.out.println("Quantas pessoas serão lidas? ");
		int n = input.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		
		for(int i=0;i<vect.length;i++) {
			input.nextLine();
			
			System.out.println("Nome: ");
			nome = input.nextLine();
			System.out.println("Idade: ");
			idade = input.nextInt();
			System.out.println("Altura: ");
			altura = input.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
			if (idade<16) {
				somaidade +=1;
			}
			soma = soma + altura;
			
		}
		
		System.out.printf("Media das alturas: %.2f ", soma/vect.length);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.2f %", (somaidade/vect.length)*100);
		System.out.println();
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getIdade()<16) {
				System.out.println(vect[i].getNome());
				System.out.println();
			}
		}
		
		
		
		
		
		
		input.close();

	}

}
