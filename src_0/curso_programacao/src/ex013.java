import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;
public class ex013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Cotação do dolar: ");
		double dolarPrice = input.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar? ");
		double qtdDolares = input.nextDouble();
		
		System.out.printf("O valor total a ser pago é: R$ %.2f ", CurrencyConverter.comprarDolares(dolarPrice, qtdDolares));
		
		
		input.close();
	}

}
