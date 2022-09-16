import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Informe A");
		int a = input.nextInt();
		System.out.println("Informe A");
		int b = input.nextInt();
		
		
		if (((a%b)==0) || ((b%a)==0))  {
			System.out.println("São divisiveis");
		}
		else {
			System.out.println("Não são divisiveis");
		}
			
		
		
		input.close();
		

	}

}
