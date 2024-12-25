import javax.swing.*;
public class Lad501_Method {
	
	// กำหนดตัวแปรแบบ Global variable
	static int[] idproduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] priceproduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemprice = 0.0;
	static boolean validitem = false;

	public static void main(String[] args) {
		inputitem();
	}// end of main () method  
	
	public static void inputitem() {
		// itemOrder กำหนด Global variable
		int itemorder = Integer.parseInt(
				JOptionPane.showInputDialog("enter item number to order:"));
		
		
		if (checkitem(itemorder)) {
			JOptionPane.showMessageDialog(null,"item"+ itemorder+ " is " +itemprice);
			System.out.print("item"+itemorder+" is "+itemprice );
		}else {
			JOptionPane.showMessageDialog(null,"Invalid item",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			System.out.print("Invalid item");
			
		}
	}//end of input item
	
	public static boolean checkitem(int item) {
		for (int i =0; i<idproduct.length;i++) {
			if(item == idproduct[i]) {
				itemprice = priceproduct[i];
				validitem = true;
			}
		}//end of for
		
		return validitem;
	}//end of checkitem() method

}
