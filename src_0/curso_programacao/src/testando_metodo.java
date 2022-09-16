import entities.Triangulo;
public class testando_metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo a, b;
		a = new Triangulo();
		b = new Triangulo();
		double areaPri, areaSeg;
		
		areaPri = a.area();
		System.out.printf("A area do primeiro triangulo é: %f", areaPri);
		areaSeg = b.area();
		System.out.printf("A area do primeiro triangulo é: %f", areaSeg);
		
		
	}

}
