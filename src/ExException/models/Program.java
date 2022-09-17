package ExException.models;

import ExException.models.entities.Account;
import ExException.models.exceptions.ValueException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");

            System.out.println("Number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.println("Holder: ");
            String holder = sc.nextLine();

            System.out.println("Initial balance: ");
            Double balance = sc.nextDouble();

            System.out.println("Withdraw limit");
            Double withdrawlimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawlimit);

            System.out.println(account);
        }

        catch (InputMismatchException e)  {
            System.out.println("Valor inserido não corresponde com o esperado!");
        }

    }
}
