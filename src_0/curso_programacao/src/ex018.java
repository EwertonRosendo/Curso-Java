import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class ex018 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String nome;
		String email;
		int quarto_Escolhido;

		Scanner input = new Scanner(System.in);
		Hotel[] vect = new Hotel[10];
		int n = 0;
		while (true) {
			System.out.println("Quantos estudantes chegaram no hotel? ");
			n = input.nextInt();
			if (0 < n && n <= 10) {
				break;
			} else {
				System.out.println("Informe um valor valido");

			}
		}
		for (int i = 0; i < 10; i++) {
			if (i == n) {
				break;
			}
			input.nextLine();
			System.out.println("Nome: ");
			nome = input.nextLine();
			System.out.println("Email: ");
			email = input.nextLine();
			System.out.println("Quarto: ");
			quarto_Escolhido = input.nextInt();

			vect[quarto_Escolhido] = new Hotel(nome, email, quarto_Escolhido);

		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s", vect[i].getQuarto_Escolhido(), vect[i].getNome(), vect[i].getEmail());

				input.close();

			}
		}
	}

}
