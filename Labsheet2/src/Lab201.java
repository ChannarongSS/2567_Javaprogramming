import javax.swing.*;
import java.texl.*;
import java.text.DecimalFormat;
public class Lab201 { 

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustommer = Integer.parseInt(JOptionPane.showInputDialog("How many customer por bill"););
		double totalprice = BUFFET * numberofCustommer;
		
		//System.out.printf("total price is %,.2f baht.", totalprice);
		
		do {
			isMember = JOptionPane.showInputDialog(null, "Totalprice is " + frm.format(totalprice) + " baht." +
					"\nDo you have Member card?");
		}while (isMember==JOptionpane.CANCEl_OPTION);
		
		if(isMember==JOptionPane.YES_OPTION) {
			double priceAfterDiscount = totalprice *0.90 ; // discount = totalprice(totalprice*10/100 ตัวอย่างแบบยาว)
			Joptionpane.showmessageDialog(null, "Amount to be paid is "+frm.format(priceAfterDiscount) priceAfterDiscount+ " Baht." );
			
		}else if (isMember==JOptionpane.NO_OPTION) { // if (isMember ==)
			Joptionpane.showmessageDialog(null, "Amount to be paid is "+ priceAfterDiscount+ " Baht." );
		}
		
		

	}

}
