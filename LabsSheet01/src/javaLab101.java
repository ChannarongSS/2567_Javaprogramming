import java.text.DecimalFormat;
import java.util.*;
public class javaLab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name  : ");
		String Name = Input.nextLine();
		
		System.out.print("Input product Unit  : ");
		int Unit = Input.nextInt();

		System.out.print("Input product per Unit : ");
		float Number = Input.nextFloat();
		
		float UnitNumber = Unit * Number;
		
		System.out.println("-----------------------------------------");
		System.out.println("Total price is "+ UnitNumber + " Baht.");
		System.out.println("-----------------------------------------");
		System.out.print("How many dscount (%) : ");
		int manyduct = Input.nextInt();
		float price = UnitNumber * manyduct/100;
		float Amount = UnitNumber - price;
		System.out.println("-----------------------------------------");
		System.out.println("Discount from "+ UnitNumber +"\t"+  frm.format(price) + "Baht." );
		System.out.println("Amount to be paid\t " + frm.format(Amount) + "Baht." );

	}

}
