import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int tempodeJogo;
		System.out.println("Informe o horario de inicio: ");
		int inicio = input.nextInt();
		System.out.println("Informe o horario de termino: ");
		int fim = input.nextInt();
		input.close();
		
		if (inicio>=fim) {
			tempodeJogo = 24 - inicio + fim;
			System.out.printf("O tempo de jogo foi de %d", tempodeJogo);
		}else {
			tempodeJogo = fim - inicio;
			System.out.printf("O tempo de jogo foi de %d", tempodeJogo);
		}
	}

}
