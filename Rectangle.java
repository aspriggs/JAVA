 public class Rectangle {
	// Create a class Rectangle with attributes length and width, each of which defaults to 1. 
	private float length = 1;
	private float width = 1;
	//Use set and get methods for both length and width. 
	public void setArea(float length, float width){
		//The set methods will verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. 
		if(length < 0 || length > 20 || width < 0 || width > 20){
			throw new IllegalArgumentException("Length/Width out of range.");
		}
		this.length = length;
		this.width = width;
	}
	
	public String toUniversalString(){
		return String.format("%.02d:%02d", length, width);
	}
	
	//Provide methods that calculate the rectangle’s perimeter and area.
	public float getArea(){
		return length * width;
	}
	
}
