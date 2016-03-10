//Use class Date of Fig 8.7 to represent an employee’s birthday. 
public class Date {
	//Provide a constructor that initializes the 3 instance variables and assumes the values provided are correct. 
	private int month;
	private int day;
	private int year;
	//Provide a set and a get method for each instance variable. 
	public void setMonth(int month){
		this.month = month;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setYear(int year){
		this.year = year;
	}
	//Provide a method displayDate that displays the month, day, and year separated by forward slashes(/). 
	public String displayDate(){
		return month+"/"+day+"/"+year;
	}
	//Add get methods to class Date. 
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int getYear(){
		return year;
	}
	
}
