import javax.swing.*;
public class Icecream {

	public static void main(String[] args) {
		final int VANILLA =10, CHOCOLATE = 15, TOPPING = 5;
		
		int icecho = Integer.parseInt(JOptionPane.showInputDialog(null,
				"[1] Vanill Flavor 10 B.\n" +
		        "[2] Chocolate Flavor 15 B.\n" +
				"Prass unmber to choose flavor:"));
		
		while (icecho != 1 && icecho != 2) {
			JOptionPane.showMessageDialog(null,
					"ERROR: Wrong choice!\nTry again...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			
			icecho = Integer.parseInt(JOptionPane.showInputDialog(null,
					"[1] Vanill Flavor 10 B.\n" +
			        "[2] Chocolate Flavor 15 B.\n" +
					"Prass unmber to choose flavor:"));
		}
		
		String ice = (icecho == 1)?"Vanilla Flavor" : "Chocolate Flavor";
		 int price = (icecho == 1)? VANILLA : CHOCOLATE;
		 
		 int toppingice = JOptionPane.showConfirmDialog(null, 
				 "Do you want to add toppingg?",
				 "Topping",
				 JOptionPane.YES_NO_OPTION);
		 
		 String toppingadd = (toppingice == JOptionPane.YES_OPTION)? "topping added" : "notopping";
		 price = (toppingice == JOptionPane.YES_OPTION)? price + TOPPING : price;
		 String priceMessage = "Yoy choose " + ice+"\n And" + toppingadd + "\n Total price =" + price + "Baht.";
		 JOptionPane.showMessageDialog(null, priceMessage);
		 
	}

}