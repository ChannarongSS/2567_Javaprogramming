import javax.swing.*;
public class javaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Inpput product Name: ");
		
		String strproductUnit = JOptionPane.showInputDialog("Input product Unit: ");
		int productUnit = Integer.parseInt(strproductUnit);
		double productprice = Double.parseDouble(JOptionPane.showInputDialog(""+ "Input price per Unit: "));
		
		double totalpriceofproduct = productUnit * productprice;
		double totalwithVat = totalpriceofproduct * 1.07;
		String frmtotalwithVat = String.format("%,.2f", totalwithVat);
		String frmtotalpriceofduct = String.format("%,.2f",totalpriceofproduct);
		
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+frmtotalpriceofduct+ "baht."+
				"\nAdd VAT7% is "+frmtotalwithVat +"baht.");
	}

}
