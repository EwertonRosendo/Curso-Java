package entities;

public class Restaurante {
	private double conta;
	private int pessoasNaMesa;
	
	public Restaurante(double conta, int pessoasNaMesa) {
		this.conta = conta;
		this.pessoasNaMesa = pessoasNaMesa;
	}
	
	public double contaDividida() {
		return conta/pessoasNaMesa;
	}
	

}
