
public class EmpWage {

	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int isAbsent = 3;


	public static void computeWage(String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrs) {
		int empHrs = 0;
		int empWage = 0;
		int days = 0;
		int totalEmpHrs = 0;

		while (days < maxWorkingDays && totalEmpHrs <= maxWorkingHrs) {
			int empCheck = (int) (Math.random() * 3) + 1;
			days++;
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				System.out.println("Employee is full time");
				break;
			case isPartTime:
				empHrs = 4;
				System.out.println("Employee is part time");
				break;
			case isAbsent:
				System.out.println("Employee is absent");
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
		}
		System.out.println("Company name : "+company);
		System.out.println("Total employee hours : " + totalEmpHrs);
		empWage = totalEmpHrs * empRatePerHr;
		System.out.println("employee Monthly wage : " + empWage);
		System.out.println();
	}

	public static void main(String[] args) {
		computeWage("Dmart", 120, 20, 170);
		computeWage("Google", 140, 21, 160);
		computeWage("Apple", 150, 18, 180);
	}
}
