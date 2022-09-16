import java.util.Locale;
import java.util.Scanner;
public class ex005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int qtd1, qtd2;
		//inteiro cod1, cod2;
		double valor1, valor2;
		
		
		System.out.println("Informe o codigo da peça 1: ");
		//cod1 = input.nextInt();
		System.out.println("Informe a quantidade da peça 1: ");
		qtd1 = input.nextInt();
		System.out.println("Informe o valor da peça 1: ");
		valor1 = input.nextDouble();
		System.out.println("Informe o codigo da peça 2: ");
		//cod2 = input.nextInt();
		System.out.println("Informe a quantidade da peça 2: ");
		qtd2 = input.nextInt();
		System.out.println("Informe o valor da peça 2: ");
		valor2 = input.nextDouble();
		input.close();
		
		System.out.printf("O total a ser pago é %.2f", ((qtd1*valor1)+(qtd2*valor2)));
		
	}

}
