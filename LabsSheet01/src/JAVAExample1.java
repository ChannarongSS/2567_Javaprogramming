import java.util.*;
import java.text.*;
public class JAVAExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
				
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("input product name: ");
		String produvtName = Input.nextLine();
		
	    System.out.print("Input product unit");
		int productUnit = Input.nextInt();
		
		System.out.print("Input price per unit");
		float productprice = Input.nextFloat();
		System.out.println();
		
		float totalpriceofproduct = productUnit *productprice;
		System.out.println("Total price is"+frm.format(totalpriceofproduct)+"baht.");
		//
		float totalwithVat = totalpriceofproduct + (totalpriceofproduct*7/100);
		System.out.println("Add VAT 7% is "+ frm.format(totalwithVat) + "baht.");
		System.out.println();
		
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.print("Add VAT 7% is "+ frmtotalwithVat + "baht.");
		System.out.println();
		System.out.print("Output using print");
		System.out.printf("Add VAT 7% is %,.2f ", totalwithVat);
		
		Input.close();

	}

}
