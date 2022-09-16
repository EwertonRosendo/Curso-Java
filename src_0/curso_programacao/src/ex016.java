import java.util.Locale;
import java.util.Scanner;

import entities.SomaVetor;

public class ex016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double soma = 0;
		System.out.println("Quantos numeros você quer informar: ");
		int n = input.nextInt();
		
		SomaVetor[] vect = new SomaVetor[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.println("Informe o numero: ");
			double num  = input.nextDouble();
			
			vect[i] = new SomaVetor(num);
		}
		System.out.println("Valores: ");
		for(int i=0; i<vect.length; i++) {
			System.out.print(vect[i].getNum());
			soma = soma+vect[i].getNum();
			
		}
		System.out.printf("Soma: %f", soma);
		System.out.printf("Media: %f", soma/vect.length);
		
		
		
		input.close();

	}

}
