import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Input author name : ");
	String authorname = scan.nextLine();
	System.out.print("Input author e-mail : ");
	String authoremail1 = scan.nextLine();
	Author author1 = new Author(authorname,authoremail1);
	System.out.println(author1);
	System.out.println();
	System.out.print("Input book title : ");
	String booktitle = scan.nextLine();
	System.out.print("Input book page : ");
	int bookpage = scan.nextInt();
	Book book1 = new Book(booktitle,author1,bookpage);
	System.out.println(book1);
	
	}

}
