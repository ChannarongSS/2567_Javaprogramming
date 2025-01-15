import java.util.*;
public class Lab307 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		String text;
		
		System.out.print("Text;: ");
		text = scanner.nextLine().toLowerCase().replace(" ","");
		
		String palindrome = "";
		for (int i = text.length() -1 ;i>=0; i--) {
			palindrome += text.charAt(i);
		}
		
		if (text.equals(palindrome)){
			System.out.println("It is palindrome.");
		}else {
			System.out.println("It is not palindrome.");
		}
		scanner.close();
	}

}