package Exceções.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a data:");
        String dat = sc.nextLine();
        try {
            Date date = sdf.parse(dat);
        }
        catch (ParseException e){
            System.out.println("Ocorreu uma exceção");

        }

        sc.close();

    }
}
