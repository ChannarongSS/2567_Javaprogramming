import javax.swing.*;
improt java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		//System.out.printIn(balance);
		int moneywithdraw = Integer.parseInt(
				JOptionPane.showInputDialog("your balance : " + balance+ 
				"\nInput money to withdraw"));
		
		if(moneywithdraw > balabance) {
			JOptionPane.showInputDialog(null,
					"Error : Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			}else if (moneywithdraw> 50000) {
				JOptionPane.showInputDialog(null,
					"Error : Cannot withdraw more than 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
			}else if (moneywithdraw%100 !=0) {
				JOptionPane.showInputDialog(null,
						"Error : Cannot withdraw " +  (moneywithdraw%100)+ " baht." ,
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
			}else JOptionpane.showMesageDialog(null,
					"You withdraw " +moneywithdraw+ " baht. " + 
			        "\n1,000 = " + (moneywithdraw/1000)+ 
			        "\n500 =  " + ((moneywithdraw%1000)/500) +
			        "\n100 = " + ()); 
		

	}

}
