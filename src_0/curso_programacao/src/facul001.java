import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class facul001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String nome;
		int quantidade;
		double preco;
		
		
		System.out.println("Nome: ");
		nome = sc.nextLine();
		System.out.println("Preco: ");
		preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		sc.close();
		
		System.out.println(produto);
	}

}
