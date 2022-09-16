package util;

public class CurrencyConverter {
	
	public static double comprarDolares(double dolarPrice, double qtdDolar) {
		return (dolarPrice*qtdDolar) + ((dolarPrice*qtdDolar)*0.06);
	}

}
