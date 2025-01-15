
public class testEmpolyee {
	public static void main(String[] args){
		//
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//
		emp1.setEmployeeDetails("Natcha",45,20.0);
		emp2.setEmployeeDetails("Attakorn",38,25.0);
		
		// Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayemploteedetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayemploteedetails();
	}
}//end of Class