package entities;

public class Bhaskara {
	private double a, b, c, delta, x1, x2;
	
	public Bhaskara(double a, double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getBhaskara() {
		delta = (b*b)-(4*a*c);
		x1 = ((-b + (Math.pow(delta, 1/2)))/(a*2));
		x2 = ((-b - (Math.pow(delta, 1/2)))/(a*2));
		
		return String.format(" ((%1.fx^2)+(%1.fx)+(%1.f)=0) Na equação x1 é igual a %f, e x2 é igual a %f", a, b, c, x1, x2);
	}

}
