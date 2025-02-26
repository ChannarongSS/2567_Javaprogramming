import java.util.*;
import java.io.*;
 
public class Lab1101 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("input Section: ");
		int section = sc.nextInt();
		
		printHeader(section);
		displayStudentList(section);
	}// end
	
	public static void printHeader(int sec) {
		System.out.println("**********************************************");
		System.out.println("\tList of Data for Section " + sec);
		System.out.println("**********************************************");
	}//end
	
	public static void displayStudentList(int sec) throws IOException {
		try(BufferedReader readFile= new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp ="";
			while ((temp = readFile.readLine())!=null) {
				String[] data = temp.split("\t");
				
				if (data.length < 6 )  continue;
				
				int studentSection  = Integer.parseInt(data[3]);
				
				if(studentSection==sec) {
					double midTerm = Double.parseDouble(data[4]);
					double finalScore= Double.parseDouble(data[5]);
					System.out.printf("%s %s \t%s \t%s %n", data[0],data[2],data[4],data[5],midTerm,finalScore,datarmineResult(midTerm,finalScore));
				}
			}//end while
			
		}//end try
		
		
	}//end  displayStudentList
	
	public static String datarmineResult(double mid , double fin) {
		return (mid+fin) <=40? "Fail":"Pass"; 
	}//end datarmineResult
	
}// end class
