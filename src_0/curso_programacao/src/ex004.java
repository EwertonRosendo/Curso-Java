import java.util.Scanner;
import java.util.Locale;
public class ex004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int number;
		double horasTrab, valorHora;
		
		System.out.println("Informe o numero do funcionario: ");
		number = input.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		horasTrab = input.nextDouble();
		System.out.println("Informe o valor das horas trabalhadas: ");
		valorHora = input.nextDouble();
		
		System.out.printf("O Salario do funcionario %d é de %.2f", number, horasTrab*valorHora);
		input.close();

	}

}
