import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionariolist;

public class ex019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		List<Funcionariolist> list = new ArrayList<>();

		System.out.println("Quantos funcionarios serão cadastrados? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			input.nextLine();

			System.out.println("ID: ");
			Integer id = input.nextInt();

			input.nextLine();

			System.out.println("Nome: ");
			String nome = input.nextLine();

			System.out.println("Salario: ");
			Double salario = input.nextDouble();

			Funcionariolist funcionario = new Funcionariolist(id, nome, salario);
			list.add(funcionario);

		} 

		System.out.println("Informe o id do funcionario que terá aumento: ");
		int idAumento = input.nextInt();
		
		//Funcionariolist pos = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		Integer pos = posicao(list, idAumento);

		if (pos == null) {
			System.out.println("Funcionario não existe");
		
		} else {
			
			System.out.println("Informe a % de aumento: ");
			double aumento = input.nextInt();
		
			list.get(pos).alterarSalario(aumento);
		}
		
		for(Funcionariolist func: list) {
			System.out.println(func);;
		}

		input.close();

	}

	public static Integer posicao(List<Funcionariolist> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
