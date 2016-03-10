//Program 5 by Anthony Spriggs 
import java.util.Scanner;

public class Multiple {
	//start main
	public static void main(String[] args){
		
		//Creates new scanner for input
		Scanner input = new Scanner(System.in);
		
		//Creates number1, number2, and remainder
		int number1;
		int number2;
		int remainder;
		
		//Input for numbers1 and number2
		System.out.print("Enter first number ");
		number1 = input.nextInt();
		System.out.print("Enter second number ");
		number2 = input.nextInt();
		
		//Calculates remainder of numbers1 and number2
		remainder = number1 % number2;
		
		//Statements based on remainder
		if (remainder != 0)
			System.out.printf("%d is NOT a multiple of %d.%n", number2, number1);
		if (remainder == 0)
			System.out.printf("%d IS a multiple of %d.%n", number2, number1);
		
		//Used to display the remainder
		//System.out.printf("Remainder is %d%n", remainder);
	}//end main
}
