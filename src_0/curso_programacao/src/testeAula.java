import java.util.Scanner;

import entities.Retangulo;

public class testeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		Retangulo retangulo;
		retangulo = new Retangulo();
		System.out.println("Informe a altura: ");
		retangulo.height = input.nextDouble();
		System.out.println("Informe a largura: ");
		retangulo.width = input.nextDouble();
		
		input.close();
		
		System.out.println(retangulo);
		
		
	}

}
