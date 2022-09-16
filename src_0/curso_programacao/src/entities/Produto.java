package entities;

public class Produto {
	private String nome;
	private double preco, desc;
	private int quantidade = 0;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.desc = desconto();
	}
	public double desconto() {
		if(quantidade<=10) {
			System.out.println("Sem desconto");
			desc = 0;
			
		}else if(quantidade>10 && quantidade <=20) {
			System.out.println("10% de desconto");
			desc = 0.1;
			
		}else if(quantidade>20 && quantidade<=50) {
			System.out.println("20% de desconto");
			desc = 0.2;
			
		}else if (quantidade>50){
			System.out.println("25% de desconto");
			desc = 0.25;
			
		}
		return desc;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return String.format("Nome: %s, Preço: %.2f, Quantidade: %d, Desconto: %f", nome, preco, quantidade, desc);
	}

}
