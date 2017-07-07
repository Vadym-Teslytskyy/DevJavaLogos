package less09HomeWork;

import java.util.Scanner;

public class WorkManMonthlySalary implements Salary{

	@Override
	public void salary() {

		System.out.println("Enter salary per month:");
		Scanner scanner = new Scanner(System.in);
		int salaryPerMonth = scanner.nextInt();
		int resInHour = 0;
		int resInYear = 0;
		resInHour = (salaryPerMonth / WORKDAYSINMONTH) / WORKHOURSINDAY;
		resInYear = salaryPerMonth*WORKMONTHSINYEAR;
		
		System.out.println("Salary in hour = "+resInHour);
		System.out.println("Salary in Year = "+resInYear);
	}
}
