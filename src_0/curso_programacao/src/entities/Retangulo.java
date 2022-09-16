package entities;
import java.lang.Math;

public class Retangulo {
	public double width;
	public double height;
	
	public double area() {
		double area = width*height;
		return area;
	}
	public double perimetro() {
		double perimetro = (width*2) + (height*2);
		return perimetro;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
		return diagonal;
	}
	
	public String toString(){
		return String.format("\nArea: %.2f, \nPerimetro: %.2f, \nDiagonal: %.2f", this.area(), this.perimetro(), this.diagonal());
		
	}
}
