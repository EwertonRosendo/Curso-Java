package entities;

public class Area {
	private final double pi = 3.1415;
	private Double lado;
	private Double largura;
	private Double altura;
	private Double raio;
	private Double base;
	
	
	public Area(double lado){
		this.lado = lado;
		this.raio = lado;
	}
	
	public Area(double largura, double altura){
		this.altura = altura;
		this.largura = largura;
		this.base = largura;
	}
	
	

	public double quadrado() {
		return lado*lado;
	}
	
	public double retangulo() {
		return altura*largura;
	}
	
	public double circulo() {
		return pi*raio*raio;
		
	}
	
	public double triangulo() {
		return base*altura/2;
	}
}
