import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;

public class aulafuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Funcionario funcionario;
		funcionario = new Funcionario();
		System.out.println("Nome: ");
		funcionario.nome = input.nextLine();
		System.out.println("Salario bruto: ");
		funcionario.salario_bruto = input.nextDouble();
		System.out.println("Imposto");
		funcionario.imposto = input.nextDouble();
		
		
		System.out.println(funcionario);
		System.out.println("Qual a porcentagem(%) de aumento você deseja? ");
		double porcent = input.nextDouble();
		funcionario.aumento_salario(porcent);

		input.close();
	}

}
