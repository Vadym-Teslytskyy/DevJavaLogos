package less09HomeWork;

import java.util.Scanner;

public class WorkManHourlySalary implements Salary {

	@Override
	public void salary() {

		System.out.println("Enter salary per hour:");
		Scanner scanner = new Scanner(System.in);
		int salaryPerHour = scanner.nextInt();
		int resInMonth = 0;
		int resInYear = 0;
		resInMonth = (salaryPerHour * WORKHOURSINDAY) * WORKDAYSINMONTH;
		resInYear = resInMonth*WORKMONTHSINYEAR;
		
		System.out.println("Salary in Month = "+resInMonth);
		System.out.println("Salary in Year = "+resInYear);
	}
	
}
