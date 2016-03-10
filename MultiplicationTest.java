import java.util.Scanner;
import java. security.SecureRandom;
//Write a program that will help an elementary school student learn multiplication.
public class MultiplicationTest {
	//This method will be called once when the application begins execution and each time the user answers the question correctly.
	public static void main(String[]args){
		int counter = 0;
		do{
			int correct = multiply();
			//The student then inputs the answer. 
			Scanner input = new Scanner(System.in);
			int answer = input.nextInt();
			//Next, the program checks the student’s answer. 
			//And let the student try the same question repeatedly until the student finally gets it right. 
			if(answer!=correct){
				//If the answer is wrong, display the message “No. Please try again.”
				System.out.printf("No. Please try again.%n");
				answer = input.nextInt();
			}
			if(answer==correct){
				//If it is correct, display the message “Very Good!” and ask another multiple question.
				System.out.printf("Very Good!%n");
				++counter;
			}
		}while(counter<=10);
	} 
	public static int random(int num){
		//Use a Random object to produce 2 positive 1-digit integers.
		SecureRandom randomNumber = new SecureRandom();
		int number = randomNumber.nextInt(9);
		return number;
	}
	//A separate method will be used to generate each new question. 
	public static int multiply(){
		int num = 0;
		int rand1 = random(num);
		int rand2 = random(num);
		int answer = rand1*rand2;
		//The program will then prompt the user with a question, such as “How much is 6 times 7?”
		System.out.printf("How much is %d times %d? ", rand1, rand2);
		return answer;
	} 
}
