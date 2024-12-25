import javax.swing.*;
public class Lad203 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Input weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input height"));// "/100"
		
		double heightT = height / 100;
		double BMI = weight / (heightT * heightT);
		
		String body;
		if (BMI < 18.5) {
			body = "Underweight";
		}else if (BMI < 24.9) {
			body = "Normal-weight";
		}else if (BMI < 29.9) {
			body = "Overweight";
		}else{
			body = "Obesity";
		}
		String frmBMI = String.format("%.1f",BMI);
		JOptionPane.showMessageDialog(null, "BMI = " + frmBMI +
				                      "\nYou're"+ body ,"BMI"
				                      ,JOptionPane.WARNING_MESSAGE);
		}
	}
