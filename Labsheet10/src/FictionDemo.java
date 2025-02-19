import java.util.Scanner;

public class FictionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Book Title : ");
		String bookTitle = sc.nextLine();
		System.out.print("book publsh year : ");
		int publicYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Author name: ");
		String authorName = sc.nextLine();
		System.out.print("Author emai: ");
		String authorEmail = sc.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle,publicYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
		System.out.print ("Autbor email, again: " );
		authorEmail = sc.nextLine();
		book1.setEmail(authorEmail);
		}
		
		Line();
		System.out.print(book1);
	}
	public static void Line() {
		for(int i=1; i<50;i++)
			System.out.print("=");
		System.out.println();
		}
}
