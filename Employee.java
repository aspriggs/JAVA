//Payroll Modification Modify the payroll system of Figs 10.4 –10.9 to include private instance variable birthdate in class Employee. 
public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final int birthMonth;
	private final int birthDay;
	private final int birthYear;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, int birthMonth, int birthDay, int birthYear){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	public int getBirthMonth(){
		return birthMonth;
	}
	
	public int getBirthDay(){
		return birthDay;
	}
	
	public int getBirthYear(){
		return birthYear;
	}
	
	@Override
	public String toString(){
		Date birthDate = new Date();
		birthDate.setMonth(birthMonth);
		birthDate.setDay(birthDay);
		birthDate.setYear(birthYear);
		return String.format("%s %s%nsocial security number: %s%nbirthday: %s%n", getFirstName(),getLastName(),getSocialSecurityNumber(),birthDate.displayDate());
	}
	
	public abstract double earnings();
}
