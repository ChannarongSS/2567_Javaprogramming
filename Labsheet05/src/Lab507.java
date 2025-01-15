import javax.swing.*;
public class Lab507{
	
	public static  void showEven(int[] nums) {
		String numbers = "";
		for (int num1 : nums   ) {
			if(num1 % 2 == 0) {
				numbers += num1 + " ";
			}
		}
		//show Input Even
		JOptionPane.showMessageDialog(null, "List of even number:\n"+ numbers);
	}
	
	public static void showOdd(int[] nums) {
		String numberodd = "";
		for (int num2 : nums ) {
			if(num2 % 2 != 0 ) {
				numberodd += num2 + " ";
			}
		}
		// show Input Odd
		JOptionPane.showMessageDialog(null, "List of even number: \n" + numberodd);
	}

	public static void main(String[] args) {
		int[] number = new int[5];
		
		for (int i =0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input your e-mail " + (i+1) +" :"));
			/*String input = JOptionPane.showInputDialog("Input number " + (i + 1) + ":");
			numbers[i] = Integer.parseInt(input); ก็ได้ */
			
		}
		
		showEven(number);
		showOdd(number);
	}
}