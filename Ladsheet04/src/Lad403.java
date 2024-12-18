import java.util.*;
public class Lad403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String Fullname ;
		String firstname;
		
		System.out.println("Please enter your name seperaled by a space. ");
		System.out.print(":");
		Fullname = input.nextLine();
		
		
		int space = Fullname.indexOf(' ');
		firstname = Fullname.substring(0,space);
		
		
		System.out.println(abbrviatName(Fullname));
		
		input.close();
		
		
		
		
		

	}
	
	public static String abbrviatName(String Name) {
		String initailLetter="";
		
		for (int i=0; i<Name.length();i++) {
			if(Name.charAt(i) == ' ') {
				initailLetter = (initailLetter+Name.charAt(i+1)).toUpperCase(); // +" . "; ใช้ได้ลดบรรทัด
				initailLetter = initailLetter+".";
			}
				
			}//end for
		return initailLetter;
		}
	

}
