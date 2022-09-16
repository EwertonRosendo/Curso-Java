import java.util.Scanner;

public class ex012 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int x = 1;
		int y = 1;
		
		while (x!=0 || y!=0) {
			
			System.out.println("Informe o X: ");
			x = input.nextInt();
			System.out.println("Informe o Y: ");
			y = input.nextInt();
			
			if (x>=0 && y>=0) {
				System.out.println("Primeiro");
			} else if (x>0 && y<0) {
				System.out.println("Segundo ");
				
			} else if (x<0 && y<0) {
				System.out.println("Terceiro");
				
			}else {
				System.out.println("Quarto");
			}
			
		}
		
		input.close();
	}

}
