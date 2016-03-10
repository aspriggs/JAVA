//Programming Assignment 2 By: Anthony Spriggs
import java.util.Scanner;

public class BasicPayRoll {
	
	//start main
	public static void main(String[] args){
		
		 //create Scanner input
		 Scanner input = new Scanner(System.in);
		
		 //create int items and set prices
		 int item1 = 23999;
		 int item2 = 12975;
		 int item3 = 9995;
		 int item4 = 35089;
		 //create int item quanities and totals
		 int item1quan;
		 int item2quan;
		 int item3quan;
		 int item4quan;
		 int item1total;
		 int item2total;
		 int item3total;
		 int item4total;
		 //create double subTotal, commission and total
		 double subTotal;
		 double commission;
		 double total;
		 //create name
		 String name;
		 
		 //input and set name
		 System.out.print("Salemen Name: ");
		 name = input.nextLine();
		 
		 //display name, input and set item quanities
		 System.out.printf("Home many of Item #1 did %s sell? ", name);
		 item1quan = input.nextInt();
		 System.out.printf("Home many of Item #2 did %s sell? ", name);
		 item2quan = input.nextInt();
		 System.out.printf("Home many of Item #3 did %s sell? ", name);
		 item3quan = input.nextInt();
		 System.out.printf("Home many of Item #4 did %s sell? ", name);
		 item4quan = input.nextInt();
		 
		 //calculate set item totals
		 item1total = item1quan * item1;
		 item2total = item2quan * item2;
		 item3total = item3quan * item3;
		 item4total = item4quan * item4;
		 
		 //calculate and set subTotal, commission, and total
		 subTotal = (item1total + item2total + item3total + item4total) * .01;
		 commission = subTotal * .09;
		 total = commission + 200;
		 
		 //display name, subTotal, commission, and total
		 System.out.printf("%s%nGross Sales: $%.2f%n", name, subTotal);
		 System.out.printf("Commission: $%.2f%n", commission);
		 System.out.printf("Gross Pay: $%.2f", total);
		 
	}//end main
}
