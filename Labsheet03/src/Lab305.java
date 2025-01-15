import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  input;
		
		System.out.print("Input some sentence : ");
		input = scanner.nextLine();
		
		while (!input.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			input = scanner.nextLine();	
			
		}
		 System.out.println();

		 
		 String[] sentence = input.split(" ");
		 for (int i = 0; i < sentence.length; i++) {
			 System.out.println(sentence[i]);
		 }
		 scanner.close();
	}
}
