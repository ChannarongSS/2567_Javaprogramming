import java.util.*;
import javax.swing.*;
public class ShoppingCart {

	public static void main(String[] args) {
		displayCardAmdtotal("Apple",10.5,"Banana",5.75,"oranqe",7.5);
		displayCardAmdtotal("Milk",20.0, "Bread",15.0);
		displayCardAmdtotal();
	}
	public static void displayCardAmdtotal (Object...Items) {
		if (Items.length == 0) {
			System.out.println("No itms in the cart.");
			return;
		}
		System.out.println("Items in the cart:");
		for(int i= 0;i< Items.length;i+=2) {
			String Itemsname = (String)Items[i];
			double Itemsprice = (double)Items[i+1];
			
			JOptionPane.showMessageDialog(null,
					"Items in the cart:\n"+
					"- " + Itemsname+
					": $"+ Itemsprice );
			System.out.printf("- %s: $%.2f%n",Itemsname,Itemsprice);
		}
		System.out.println();

	}

}
