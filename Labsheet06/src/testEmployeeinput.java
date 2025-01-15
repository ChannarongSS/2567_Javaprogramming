import java.util.*;
public class testEmployeeinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//input data for second Employee
		System.out.println("Enter etails for Employee 1 :");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hour Woked: ");
		int empHourWoked1 = scan.nextInt();
		System.out.print("Hour Reta: ");
		double emphourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHourWoked1, emphourlyRate1);
		Line('-');
		emp1.displayemploteedetails();
		Line('*');
		
		scan.nextLine();//consume leftover newline
		
		//input data for second Employee
		System.out.println("Enter etails for Employee 1 :");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hour Woked: ");
		int empHourWoked2 = scan.nextInt();
		System.out.print("Hour Reta: ");
		double emphourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHourWoked2, emphourlyRate2);
		Line('-');
		emp2.displayemploteedetails();
		Line('*');
		
		
		scan.close();
	} //end of main();

	
	//Line method
	public static void Line(char symbol) {
		//System.out.print("--------------------------------------");
		for (int i=1; i<50;i++) {
			System.out.print(symbol);
		 }
	}
	
}//end of Class
