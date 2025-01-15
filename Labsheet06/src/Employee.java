
public class Employee {
	private String name;
	private int hourWoked;
	private double hourlyRate;
	
	// mehod to set emploee dtalis
	public void setEmployeeDetails(String empName, int hours, double rate) {
		name = empName;
		hourWoked = hours;
		hourlyRate = rate;
	}
	
	//method to sat calculateSalary
	public double calculateSalary(){
		double salary = hourWoked * hourlyRate;
		if (hourWoked > 40) {
			double bonus = salary * 0.10; // Bonus is 10% of salary
			salary += bonus;
		}
		return salary;
	}
	// method to display emplotee details
	public void displayemploteedetails() {
		System.out.println("Name: " + name);
		System.out.println("kour Woked: " + hourWoked);
		System.out.println("kourly Rate : " + hourlyRate);
		System.out.println("Total Salary : " + calculateSalary());
		
	}

}
