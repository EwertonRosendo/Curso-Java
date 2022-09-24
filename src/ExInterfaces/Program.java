package ExInterfaces;

import ExInterfaces.Model.Entities.Contract;
import ExInterfaces.Model.Entities.Installment;
import ExInterfaces.Model.Services.ContractService;
import ExInterfaces.Model.Services.OnlinePaymentService;
import ExInterfaces.Model.Services.PaypalService;

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


        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date: ");
        Date date = sdf.parse(sc.next());

        System.out.print("Contract value: ");
        double value = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        int qtdInstallments = sc.nextInt();

        Contract contract = new Contract(number, value, date);

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, qtdInstallments);

        for (Installment it : contract.getInstallments()){
            System.out.println(it);
        }




        sc.close();
    }
}
