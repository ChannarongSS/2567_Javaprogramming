import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		int sentence=0;
		
		String input = JOptionPane.showInputDialog("Input a sentence: ");
		
		while (!input.endsWith(".")) {
			input = JOptionPane.showInputDialog("Input a sentence, again: ");	
			}
		
		for (int i = 0; i < input.length();i++ ) {
			if (input.charAt(i)== ' ') {
				sentence++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "This sentence has " + sentence +"spaceber.\n "+"This sentence has "+(sentence+1)+" word.");
	}

}