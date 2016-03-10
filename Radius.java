import java.util.Scanner;

public class Radius {
	//Write an application that prompts the user for the radius of a circle
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input radius: ");
		double radius = input.nextDouble();
		double area = circleArea(radius);
		System.out.printf("The area of the circle is %f.", area);
	}
	//and uses a method called circleArea to calculate the area of the circle.
	public static double circleArea(double radius){
		double area = Math.PI * (radius * radius);
		return area;
	}
}
