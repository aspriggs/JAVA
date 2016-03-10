import java.util.Scanner;

public class BarChart {
	//start main
	public static void main (String[] args){
		//Set salemen counter
		int saleCount = 1;
		
		Scanner input = new Scanner(System.in);
		//Basic directions
		System.out.printf("Input the total units sold (1-30) for each salemen to view in bar graph. Maximum 5 salemen may be displayed on graph.%nTotal Units Sold(1-30): ");
		//loop until salesmen counter is at 5 and input is 
		while (input.hasNext() && saleCount <= 5){
			System.out.printf("Salesmen Number %d | ", saleCount);
			//User inputs total units sold
			int sale = input.nextInt();
			//Determines is input is between 1-30
			if(sale>=1 && sale<=30){
				++saleCount;
				//Displays * bar graph
				switch(sale){
				case 1: 
					System.out.println("*");
					break;
				case 2: 
					System.out.println("**");
					break;
				case 3: 
					System.out.println("***");
					break;
				case 4: 
					System.out.println("****");
					break;
				case 5: 
					System.out.println("*****");
					break;
				case 6: 
					System.out.println("******");
					break;
				case 7: 
					System.out.println("*******");
					break;
				case 8: 
					System.out.println("********");
					break;
				case 9: 
					System.out.println("*********");
					break;	
				case 10: 
					System.out.println("**********");
					break;
				case 11: 
					System.out.println("***********");
					break;
				case 12: 
					System.out.println("************");
					break;
				case 13: 
					System.out.println("*************");
					break;
				case 14: 
					System.out.println("**************");
					break;
				case 15: 
					System.out.println("***************");
					break;
				case 16: 
					System.out.println("****************");
					break;
				case 17: 
					System.out.println("*****************");
					break;
				case 18: 
					System.out.println("******************");
					break;	
				case 19: 
					System.out.println("*******************");
					break;
				case 20: 
					System.out.println("********************");
					break;
				case 21: 
					System.out.println("*********************");
					break;
				case 22: 
					System.out.println("**********************");
					break;
				case 23: 
					System.out.println("***********************");
					break;
				case 24: 
					System.out.println("************************");
					break;
				case 25: 
					System.out.println("*************************");
					break;
				case 26: 
					System.out.println("**************************");
					break;
				case 27: 
					System.out.println("***************************");
					break;
				case 28: 
					System.out.println("****************************");
					break;
				case 29: 
					System.out.println("*****************************");
					break;
				case 30: 
					System.out.println("******************************");
					break;	
				}
			//Asks for input again if not valid
			}else{
				System.out.printf("Invalid. Try again.%nTotal Units Sold(1-30): ");
			}
		}	
	}//end main
}
