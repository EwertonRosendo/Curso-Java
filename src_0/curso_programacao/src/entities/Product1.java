package entities;
import java.util.Locale;
import java.util.Scanner;
public class Product1 {
	public String nome;
	public double price;
	public int quantity;
	
	public void getProduto() {
		Locale.setDefault(Locale.US);
		System.out.printf("\nProduct data: %s, %.2f, %d units, Total: %f", nome, price, quantity, price*quantity);
	}
	
	public void addProd() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("\nQuantidade para adicionar");
		int qtd = input.nextInt();
		quantity = quantity + qtd;
		System.out.printf("Updated data: %s, %.2f, %d units, Total: %f", nome, price, quantity, price*quantity);
		
	}
	public void removProd() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("\nQuantidade para remover");
		int qtd = input.nextInt();
		quantity = quantity - qtd;
		System.out.printf("Updated data: %s, %.2f, %d units, Total: %f", nome, price, quantity, price*quantity);
		
	}
	
	public String toString() {
		return String.format("Produto:%s , Preço: %f, quantidade: %d,total:%f", this.nome, this.price, this.quantity, this.price*this.quantity);
	}
}
