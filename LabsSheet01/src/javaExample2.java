import javax.swing.*;
public class javaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Inpput product Name");
		
		String StrProductUnit = JOptionPane.showInputDialog("Input product Unit:");
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+ "Input price per Unit"));
		
		double totalpriceofproduct = productUnit *productPrice;
		double totalwithVat = totalpriceeofproduct * 1.07;
		System frmtotalPriceofduct = String.format("%,.2f",)
		
		JOptionpane.showMessageDialog(null, 
				"Total Price is "+totalpriceofproduct+ "baht."
				"\nAdd VAT7% is "+totalwithVat+"baht.");
	}

}
