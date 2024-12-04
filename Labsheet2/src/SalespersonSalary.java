import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.In);
		
		
		final double BASE_SALARY = 1000.0;
		final double COMMISSION_RATE;
		final int SENTiNEL = -1;
		
		int sales;
		double salary;
		
		while (true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = input.nextInt();
		
		
		
        if	(sales==SENTiNEL)	{	
			break;
			}
		
		salary = BASE_SALARY + (sales * COMMISSION_RATE);
        
        System.out.printf("The saloperson's salary is : $%,.2f%n%n", salary);
		}
		
		System.out.println("bye");
		
		input.close();

	}

}
