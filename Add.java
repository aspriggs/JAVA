//Program 4 by Anthony Spriggs 

import java.util.Scanner;

public class Add{
	//start main
	public static void main(String[] args){
		
		//Creates new scanner for input
		Scanner input = new Scanner(System.in);
		
		//Creates number1, number2, and sum
		int number1;
		int number2;
		int sum;
		
		//Input for numbers1 and number2
		System.out.print("Enter first number ");
		number1 = input.nextInt();
		System.out.print("Enter second number ");
		number2 = input.nextInt();
		
		//Calculates sum of numbers1 and number2
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
	}//end main
}
