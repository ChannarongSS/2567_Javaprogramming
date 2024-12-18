import javax.swing.*;

public class Lad401 {
	// main method
	public static void main(String[] args) { 
		inputEmail(); 
	}//end of main() method
	
	//inputEmail() method
	public static void inputEmail() { 
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:"); 
			if (varEmail != null && !varEmail.isEmpty()) {
				checkEmailErorr(varEmail);
				
			}else {
				JOptionPane.showConfirmDialog(null," E-mail cannot be emply!!!");	 
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]:"); 
		}while(ans !=null && ans.equalsIgnoreCase("y"));
	}//end of inputEmail() method
		   
	//checkEmailError() Method
		public static void checkEmailErorr(String email) {
			while (email.startsWith("s") || email.contains(" ")) {
				email = JOptionPane.showInputDialog("Invalid e-mail. input your e-mail again"); 
		}       
			email = email.toLowerCase();
			JOptionPane.showMessageDialog(null, 
					checkEmail(email)
			?"Your e-mai is "+ email 
			:"your e-mail is not hotmail or gmail address"
			);
			
     }//end of checkEmailError() method
		public static boolean checkEmail (String email) { 
			/*if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;			
		}else {
			return false;			
		}*/
		
		/*if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) { 
			return true;			
		}
		return false; */
			
			return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com"); 
		}////end of checkEmail() method

  
}         

