import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class ex014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta;
		String nome;
		int num_Conta;
		double valor_Depositado;

		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Informe o Nome: ");
		nome = input.nextLine();
		System.out.println("Informe o numero da conta");
		num_Conta = input.nextInt();

		while (true) {
			System.out.println("Deseja realizar um deposito inicial?");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			int if_Deposito = input.nextInt();

			if (if_Deposito == 1) {
				System.out.println("Informe o valor a ser depositado: \n");
				valor_Depositado = input.nextDouble();
				 conta = new Conta(nome, num_Conta, valor_Depositado);

				break;
			} else if (if_Deposito == 2) {

				System.out.println("OK, nenhum valor será depositado inicialmente!");
				 conta = new Conta(nome, num_Conta);
				break;
			}
		}

		System.out.println(conta);
		
		System.out.println("Informe um valor de deposito: \n");
		conta.setDeposit(input.nextDouble());
		System.out.printf("Updated data\n %s", conta);
		
		System.out.println("\nInforme o valor de saque: \n");
		conta.setWithdraw(input.nextDouble());
		System.out.printf("Updated data\n %s", conta);
		

		input.close();

	}

}
