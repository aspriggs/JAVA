import java.util.Scanner;

public class DateTest {
//Write a test application named DateTest that demonstrates class Date’s capabilities.
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		Date theDate = new Date();
		
		System.out.println("Enter month: ");
		int month = input.nextInt();
		theDate.setMonth(month);
		System.out.println("Enter day: ");
		int day = input.nextInt();
		theDate.setDay(day);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		theDate.setYear(year);
		
		System.out.printf("The date you input is: %s%n%n", theDate.displayDate());
	}
}

