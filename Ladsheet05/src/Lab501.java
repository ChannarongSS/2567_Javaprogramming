import java.util.Scanner;
import javax.swing.*;

import javax.swing.*;
public class Lab501 {

	public static void main(String[] args) {
		int[] idproduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceproduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		double itemprice = 0.0;
		boolean validitem = false;
		
		int itemorder = Integer.parseInt(JOptionPane.showInputDialog("enter item number to order:"));
		
		for (int i =0; i<idproduct.length;i++) {
			if(itemorder == idproduct[i]) {
				itemprice = priceproduct[i];
				validitem = true;
			}
			
		}//end of for
		
		if(validitem) {
			JOptionPane.showMessageDialog(null,"item"+ itemorder+ " is " +itemprice);
			System.out.print("item"+itemorder+" is "+itemprice );
		}else {
			JOptionPane.showMessageDialog(null,"Invalid item",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			System.out.print("Invalid item");
		}
	}

}