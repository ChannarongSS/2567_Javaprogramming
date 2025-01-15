import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		int sentence=0;
		System.out.print("Input a sentence : ");
		String input = scanner.nextLine();
		
		while (!input.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			input = scanner.nextLine();
		}
		for (int i = 0; i < input.length();i++ ) {
			if (input.charAt(i)== ' ') {
				sentence++;
			}
		}
		
		System.out.println();
		System.out.println("This sentence has " + sentence + "spaceber.");
		System.out.println("This sentence has " + (sentence+1) + "word.");
		
		scanner.close();
	}

}