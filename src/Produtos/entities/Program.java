package Produtos.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> product = new ArrayList<>();

        System.out.println("Quantos objetos serão inseridos? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n;i++) {


            System.out.println("Common, used or imported?(c/u/i) ");
            String duv = sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (duv.charAt(0) == 'c') {
                product.add(new Product(name, price));

            } else if (duv.charAt(0) == 'u') {
                sc.nextLine();
                System.out.println("Date: ");
                Date date = sdf.parse(sc.nextLine());
                product.add(new UsedProduct(name, price, date));


            } else if (duv.charAt(0) == 'i') {
                System.out.println("Envio: ");
                Double envio = sc.nextDouble();
                product.add(new ImportedProduct(name, price, envio));

            }
            sc.nextLine();

        }
        for (Product p: product){
            System.out.println(p);
            System.out.println();
        }
        sc.close();
    }
}
