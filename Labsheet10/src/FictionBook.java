
public class FictionBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
		int Sp = author_name.indexOf(" ");
		fname = author_name.substring(0,Sp);
		lname = author_name.substring(Sp+1);
		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email ;
	}
	
	@Override
	public String getFirstName() {
		return this.fname.toUpperCase();
	}
	
	@Override
	public String getLastName() {
		return this.lname.toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com"))
		   return true;
		return false;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int  totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	@Override
	public  String toString( ) {
		return getTitle() + "wrile by " + getLastName().substring(0,1) +
			"." + getFirstName() + "(" + getEmail() + ")" + 
				"\npublished for " + totalPublicYear() + "year(s)." ;
	}

	
	
	
}
