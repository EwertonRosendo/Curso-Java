package entities;

public class Funcionario {
	public String nome;
	public double salario_bruto, imposto;

	
	
	public void aumento_salario(double porcentagem) {
		double novo_salario = this.salario_bruto + (this.salario_bruto*(porcentagem/100));
		System.out.printf("Updated data: \nnome: %s, \nnovo salario: %.2f",nome, novo_salario-imposto );
	}
	
	public String toString() {
		return String.format("Nome: %s, Salario liquido: %.2f", this.nome, this.salario_bruto-this.imposto);
	}
}
