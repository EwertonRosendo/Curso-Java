package entities;

public class Funcionariolist {
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionariolist(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
			
	}

	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void alterarSalario(Double porct) {
		this.salario = this.salario + (this.salario*(porct/100));
		
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", id, nome, salario);
	}
	
	
	
}
