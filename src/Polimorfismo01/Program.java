package Polimorfismo01;

import Polimorfismo01.entities.Employee;
import Polimorfismo01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios vão ser cadastrados?");
        int n = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();
        for(int i=0; i<n;i++){
            System.out.println("Outsourced? [y/n]");
            String word = sc.next();
            sc.nextLine();
            if (word.charAt(0) =='y' || word.charAt(0) =='Y' ){

                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Hours: ");
                int hours = sc.nextInt();

                System.out.println("Value per hour");
                double valuePerHour = sc.nextDouble();

                System.out.println("Adicional: ");
                double additional = sc.nextDouble();

                employeeList.add(new OutsourcedEmployee(nome, hours, valuePerHour, additional));

            }else if (word.charAt(0) =='n' || word.charAt(0) =='N' ){



                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Hours: ");
                int hours = sc.nextInt();

                System.out.println("Value per hour");
                double valuePerHour = sc.nextDouble();

                employeeList.add(new Employee(nome, hours, valuePerHour));

        }
    }

        for (Employee func: employeeList){
            System.out.println(func);
        }

        sc.close();
    }
}
