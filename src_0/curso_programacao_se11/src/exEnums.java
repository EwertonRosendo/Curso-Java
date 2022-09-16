import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class exEnums {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Level: ");
		String level = sc.nextLine();
		
		System.out.println("Base salary: ");
		double salary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n;i++) {
			sc.nextLine();
			System.out.printf("Enter contract #%d data: ",i+1);
			System.out.println("Date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Value per hour: ");
			double valueHour = sc.nextDouble(); 
			
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract hourcontract = new HourContract(contractDate,valueHour, hours);
			
			worker.addContract(hourcontract);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %f", monthAndYear, worker.income(year, month));
		
		
		
		
		
		
		
		
		sc.close();
		
	}
	
	
}
