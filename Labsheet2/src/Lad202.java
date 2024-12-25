import java.util.*;


public class Lad202 {

	public static void main(String[] args) {
		Scanner CG = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int  num = CG.nextInt();
		
		
		while (true) {
			System.out.print("Input number : ");
			int  number = CG.nextInt();
			if (number < num) {
				break;
			}
			num = number;
		}System.out.print("\nBYE BYE");  
		CG.close();
	}

}