import java.util.Scanner;

public class ex008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = input.nextInt();
		
		if ((num%2)==0) {
			System.out.printf("%d é um numero par", num);
			
		}else {
			System.out.printf("%d é um numero impar", num);
		}
		
		input.close();
		
	}
}
