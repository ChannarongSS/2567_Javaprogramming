import java.util.*;
public class Lab403 {
	
	public static String abbreviatName(String fullname ) {
		String itLt ="";
		for(int i = 0; i < fullname.length();i++) {
			if(fullname.charAt(i) ==' ') {
				itLt += (""+fullname.charAt(i+1)).toUpperCase()+ ".";
			}
		}
		return itLt;
	}
	
	
	// show Input main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullname, firstname;
		
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		fullname = scanner.nextLine();
		
		int check = fullname.indexOf(' ');
		firstname = fullname.substring(0,check);
		
		System.out.println(abbreviatName(fullname) +firstname);
		
		scanner.close();
		
	}

}