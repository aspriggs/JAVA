
public class PayrollSystemTest {
	public static void main(String[]args){
		SalariedEmployee salariedEmployee = new SalariedEmployee("John","Smith","111-111-1111", 1, 1, 1950, 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen","Price","222-222-222", 2, 2, 1950, 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","333-333-3333", 3, 3, 1950, 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob","Lewis","444-444-4444", 4, 4, 1950, 5000, .04, 300);
		
		/*System.out.println("Employees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings()); 
		*/
		
		int currentMonth = 1;
		//Create an array of Employee variables to store references to the various employee objects. 
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println("Process employees polymorphically:");
		
		//Assume that payroll is processed once per month. 
		while(currentMonth<=12){
			System.out.printf("Month: %s%n%n", currentMonth);
			for (Employee currentEmployee : employees){
				System.out.println(currentEmployee);
				if(currentEmployee.getBirthMonth()==currentMonth){
					//In a loop, calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the persons payroll amount if the current month is the one in which the Employee’s birthdate occurs.
					System.out.printf("earned $%,.2f HAPPY BIRTHDAY!!!%n%n", currentEmployee.earnings()+100);
				}else{
					System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
				}
			}
			currentMonth++;
		}
	}
}
