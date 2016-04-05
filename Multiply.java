import java.util.Scanner;
import java. security.SecureRandom;
//Write a program that will help an elementary school student learn multiplication.
public class Multiply {
	
	public static int random(int num){
		//Use a Random object to produce 2 positive 1-digit integers.
		SecureRandom randomNumber = new SecureRandom();
		int number = randomNumber.nextInt(10);
		return number;
	}
	//A separate method will be used to generate each new question. 
	public static int multiply(){
		int num = 0;
		int rand1 = random(num);
		int rand2 = random(num);
		int answer = rand1*rand2;
		//The program will then prompt the user with a question, such as “How much is 6 times 7?”
		System.out.printf("%n%d x %d= ", rand1, rand2);
		return answer;
	} 
}
