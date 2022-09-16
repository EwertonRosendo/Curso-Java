import java.util.Scanner;
public class ex001 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		a = input.nextInt();
		System.out.println("Informe o segundo numero");
		b = input.nextInt();
		System.out.printf("A soma de %d + %d é %d", a, b, a+b);
		
		input.close();
		
	}

}
