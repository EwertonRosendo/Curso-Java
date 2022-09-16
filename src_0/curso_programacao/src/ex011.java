import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		int senha = 0;
		Scanner input = new Scanner(System.in);
		while(senha!=2002) {
			
			System.out.println("Informe a senha");
			senha = input.nextInt();
			if (senha!=2002) {
				System.out.println("senha incorreta! ");
			}
			
		}
		System.out.println("Senha permitida");
		
		
		input.close();
	}

}
