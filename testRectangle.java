//Write a program to test class Rectangle.
public class testRectangle {
	public static void main(String[]args){
		Rectangle rectangle = new Rectangle();
		
		rectangle.setArea(15,10);
		
		System.out.printf("The area of the rectangle is: %.2f units%n%n", rectangle.getArea());
		
		try{
			rectangle.setArea(25,-1);
		}
		catch(IllegalArgumentException e){
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
	}
}
