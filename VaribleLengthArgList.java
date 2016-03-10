public class VaribleLengthArgList {
	//Write an application that calculates the product of a series of integers that are passed to method product using a variable-length argument list. 
	public static int product(int...numbers){
		for(int a : numbers);
		return numbers[0]*numbers[1];
	}
	public static void main(String[]args){
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		//Test your method with several calls, each with a different number of arguments.
		System.out.printf("a1 = 1%na2 = 2%na3 = 3%na4 = 4%n", a1, a2, a3, a4);
		System.out.printf("Product of a1 and a2 is %d.%n", product(a1,a2));
		System.out.printf("Product of a1 and a3 is %d.%n", product(a1,a3));
		System.out.printf("Product of a1 and a4 is %d.%n", product(a1,a4));
		System.out.printf("Product of a2 and a2 is %d.%n", product(a2,a2));
		System.out.printf("Product of a2 and a3 is %d.%n", product(a2,a3));
		System.out.printf("Product of a2 and a4 is %d.%n", product(a2,a4));
		System.out.printf("Product of a3 and a3 is %d.%n", product(a3,a3));
		System.out.printf("Product of a3 and a4 is %d.%n", product(a3,a4));
		System.out.printf("Product of a4 and a4 is %d.%n", product(a4,a4));
	}
	
}
