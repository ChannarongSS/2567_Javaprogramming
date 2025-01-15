import java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Message;
		
		System.out.print("Input your Message");
		Message = scanner.nextLine();
		if (Message.indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}else {
			System.out.println(Message);
		}
		
		scanner.close();
	}

}