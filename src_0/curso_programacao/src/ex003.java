import java.util.Scanner;
public class ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		System.out.printf("A diferença entre a*b e c*d é %d", ((a*b)-(c*d)));
		input.close();
	}

}
