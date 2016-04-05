import java. security.SecureRandom; 
public class Divide {
    public static int random(int num){
        //Use a Random object to produce 2 positive 1-digit integers.
        SecureRandom randomNumber = new SecureRandom();
        int number = randomNumber.nextInt(100);
        return number;
    }
    
    public static int divide(){
        //Creates number1, number2, and remainder
        int num = 0;
        int number1 = 0;
        int number2 = 0;
        int remainder;
        
        do{
          number1 = random(num);
          number2 = random(num);
          if(number1 == 0 || number2 == 0){
                remainder = 1;
            }else if(number1>=number2){
                //Calculates remainder of numbers1 and number2
                remainder = number1 % number2;
            }else{
                //Calculates remainder of numbers2 and number1
                remainder = number2 % number1;
            }
          }while(remainder != 0);
          
        if(number1>=number2){
                //Input for numbers1 and number2
                int answer = number1/number2;
        		//The program will then prompt the user with a question, such as “How much is 6 times 7?”
        		System.out.printf("%n%d / %d = ", number1, number2);
        		return answer;
            }else{
                //Input for numbers2 and number1
                int answer = number2/number1;
        		//The program will then prompt the user with a question, such as “How much is 6 times 7?”
        		System.out.printf("%n%d / %d = ", number2, number1);
        		return answer;
            } 
        //Used to display the remainder
        //System.out.printf("Remainder is %d%n", remainder);
    }//end main
}
