
public class Customer {
	private int Id;
	private String name;
	private int discount;
	
	Customer(int id,String name,int discustome) {
		this.Id =id;
		this.name = name;
		this.discount = discustome;
	}
	
	public int getID() {
		return this.Id;	
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getdiscount() {
		return this.discount;
	}
	
	public void setDiscount (int discount) {
		this.discount = discount;
	}
	
	//toString method
		public String toString() {
			return getname() + "(" + getID() + ")("+ getdiscount()+ "%)";
		}
}
