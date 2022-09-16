package ex001;

import ex001.entities.Client;
import ex001.entities.Order;
import ex001.entities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Client data: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        System.out.println("Birthday(dd/mm/yyyy): ");
        String aniversario = sc.nextLine();
        Date birthday = sdf.parse(aniversario);

        Client client = new Client(name, email, birthday);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());


        System.out.println("how many itens to this order? ");


        int n = sc.nextInt();





        sc.close();

    }
}
