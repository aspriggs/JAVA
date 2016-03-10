import java.util.Scanner;

public class MultipleMIN {
	public static void main(String[]args){
		//Incorporate this method into an application that inputs a series of pairs of integers (1 pair at a time) and determines whether the second value in each pair is a multiple of the first.
		multiple();
	}
	
	public static void multiple(){
	Scanner input = new Scanner(System.in);
		System.out.println("Input two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//Write is a Multiple that determines, for a pair of integers, whether the second integer is a multiple of the first. 
		int remainder = num1 % num2;
		//The method will take 2 integer arguments and return true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator].
		if(remainder == 0){
			System.out.printf("%d IS a multiple of %d.", num2, num1);
		}else{
			System.out.printf("%d is NOT a multiple of %d.", num2, num1);
		}
	}
}
