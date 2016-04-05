
/**
 * Basic math tests using the Addition, Subtract, Multiply, and Divide classes.
 * 
 * @author (l0ne_w0lf) 
 * @version (1.0)
 */

import java.util.Scanner;

public class MathTest
{
    //This method will be called once when the application begins execution and each time the user answers the question correctly.
    public static void main(String[]args){
        System.out.printf("%n%nThis is a simple Math test. You must get each question correct to complete.%n");
        int addCounter = 0; 
        int subtractCounter = 0; 
        int xCounter = 0;
        int divideCounter = 0;
        int wrong = 0;
        
        System.out.printf("%nAddition%n");
        do{
            Addition addition = new Addition();
            int correct = addition.add();
            //The student then inputs the answer. 
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            //Next, the program checks the student’s answer. 
            //And let the student try the same question repeatedly until the student finally gets it right. 
            if(answer!=correct){
                //If the answer is wrong, display the message “No. Please try again.”
                System.out.printf("No. Please try again.%n");
                answer = input.nextInt();
                ++wrong;
            }
            if(answer==correct){
                //If it is correct, display the message “Very Good!” and ask another multiple question.
                System.out.printf("Very Good!%n");
                ++addCounter;
            }
        }while(addCounter<=10);
        System.out.printf("%nSubtraction%n");
        do{
			Subtract subtract = new Subtract();
		    int correct = subtract.subtract();
			//The student then inputs the answer. 
			Scanner input = new Scanner(System.in);
			int answer = input.nextInt();
			//Next, the program checks the student’s answer. 
			//And let the student try the same question repeatedly until the student finally gets it right. 
			if(answer!=correct){
				//If the answer is wrong, display the message “No. Please try again.”
				System.out.printf("No. Please try again.%n");
				answer = input.nextInt();
				++wrong;
			}
			if(answer==correct){
				//If it is correct, display the message “Very Good!” and ask another multiple question.
				System.out.printf("Very Good!%n");
				++subtractCounter;
			}
		}while(subtractCounter<=10);
		System.out.printf("%nMultiplication%n");
        do{
            Multiply multiply = new Multiply();
            int correct = multiply.multiply();
            //The student then inputs the answer. 
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            //Next, the program checks the student’s answer. 
            //And let the student try the same question repeatedly until the student finally gets it right. 
            if(answer!=correct){
                //If the answer is wrong, display the message “No. Please try again.”
                System.out.printf("No. Please try again.%n");
                answer = input.nextInt();
                ++wrong;
            }
            if(answer==correct){
                //If it is correct, display the message “Very Good!” and ask another multiple question.
                System.out.printf("Very Good!%n");
                ++xCounter;
            }
        }while(xCounter<=10);
        
        System.out.printf("%nDivision%n");
        do{
            Divide divide = new Divide();
            int correct = divide.divide();
            //The student then inputs the answer. 
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            //Next, the program checks the student’s answer. 
            //And let the student try the same question repeatedly until the student finally gets it right. 
            if(answer!=correct){
                //If the answer is wrong, display the message “No. Please try again.”
                System.out.printf("No. Please try again.%n");
                answer = input.nextInt();
                ++wrong;
            }
            if(answer==correct){
                //If it is correct, display the message “Very Good!” and ask another multiple question.
                System.out.printf("Very Good!%n");
                ++divideCounter;
            }
        }while(divideCounter<=10);
        
        if(wrong>0){
        System.out.printf("%n%nYou got %d incorrect.%n%n",wrong);
    }   else{
        System.out.printf("%n%nYou got all your answers right on the first try! Great job!%n%n");
    }
    } 
   
}