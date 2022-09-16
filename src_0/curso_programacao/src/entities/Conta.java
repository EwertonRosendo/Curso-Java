package entities;

public class Conta {
	private String nome;
	private int numero_Conta;
	private double balanco_Conta;
	
	public Conta(){
		
	}
	public Conta(String nome, int numero_Conta,double initialDeposit){
		this.nome = nome;
		this.numero_Conta = numero_Conta;
		setDeposit(initialDeposit);
	}
	public Conta(String nome, int numero_Conta) {
		this.nome = nome;
		this.numero_Conta = numero_Conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero_Conta() {
		return numero_Conta;
	}
	
	public void setDeposit(double deposit) {
		this.balanco_Conta = this.balanco_Conta + deposit;
	}
	
	public void setWithdraw(double withdraw) {
		this.balanco_Conta = this.balanco_Conta - withdraw - 5; 
	}
	
	public double getBalanco_Conta() {
		return balanco_Conta;
	}
	
	public String toString() {
		return String.format("Account data: \nAccount: %d, Holder: %s, Balance: %.2f",getNumero_Conta(), getNome(), getBalanco_Conta()); 
	}
	

}
