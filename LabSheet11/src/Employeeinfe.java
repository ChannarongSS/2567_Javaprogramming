import java.io.IOException;
import java.util.Scanner;

public class Employeeinfe {

	public static void main(String[] args) throws IOException{
		//ประกาศ object input เพื่อรับข้อมูลทาง keyboard
		Scanner sc = new Scanner(System.in);
		
		String choose;
		
		System.out.print("Insert or Search Data:");
		choose = sc.next() .toLowerCase();
		
		while (!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Inert or search Data ,again? :");
			choose = sc.next().toLowerCase();
		}//end while
		
		SaveandOpen objFile = new SaveandOpen();
		if (choose.equals("insert")) {
			objFile.insert();
			
		}else if  (choose.equals("search")) {
			System.out.print("\nEnter departmont: ");
			String dept = sc.next().toLowerCase();
			objFile.setDept(dept);
			objFile.searchData();
		}
		
	}//end main

}
