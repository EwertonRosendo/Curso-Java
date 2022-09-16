import java.util.Scanner;

public class ex007 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int n  = input.nextInt();
		
		if (n>=0) {
			
			System.out.println("Não negativo");
		}else {
			System.out.println("NEGATIVO");
		}
		input.close();
		
	}
	

}
