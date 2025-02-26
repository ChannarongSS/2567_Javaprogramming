import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void  insert() throws IOException {
		// ปรพกาศ object Input  รับข้อมูลบน Keyboard
		Scanner sc = new Scanner(System.in);
		//ประกาศ Object  ชื่อ  writeFile 
		PrintStream writeFile= new PrintStream(new File("src//txtFile//employee.txt"));
		String answer;
		do {
			
			super.header();
			//รับข้อมูลชื่อกับแผนกทาง keyboard
			System.out.print("Enter name : ");
			name = sc.next();
			System.out.print("Enter departmont: ");
			dept = sc.next();
			//บันทึกข้อมูลชื่อกับแผนกลงไปในไฟล์ที่กำหนดไว้
			writeFile.println(name+"\t" + dept);
			System.out.print("Do you want to input data again? : ");
			answer= sc.next();
		}while(answer.equalsIgnoreCase("y"));
	}// end insert
	
	public void searchData()  {
		try {
			Scanner readfile = new Scanner(new File("src//txtFile//employee.txt"));
			int i=0;
			boolean check = false;
			super.header();
			while(readfile.hasNext()) {
				name = readfile.next();
				dept = readfile.next();
				
				if (dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+"(" + name);
					check = true;
				}
			}// end while
			
			if (check) {
				super.header();
				System.out.print("Exployee in dept " + super.getDept() + "is " + i + "person(s) .");
				super.header();
			}else {
				System.out.print("\nSorry in dept " + super.getDept() + "in file. ");
			}
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
		
	}// end searchData
	
}
