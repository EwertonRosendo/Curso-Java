import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nVezes, num;
		int soma = 0;
		
		System.out.println("Informe quantas vezes perguntar ");
		nVezes = input.nextInt();
		
		
		for (int i=0;i!=nVezes; i+=1) {
			
			System.out.println("Informe o numero: ");
			num = input.nextInt();
			soma += num;
		}
		System.out.printf("A soma dos valores digitados é: %d", soma);
		
		input.close();
		
		
	}

}
