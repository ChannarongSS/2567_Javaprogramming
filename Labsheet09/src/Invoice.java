
public class Invoice {
	private int invid;
	private Customer customer;
	private double  amount;
	
	Invoice(int invid , Customer custmer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvoiceID () {
		return this.invid;
	}
	
	public double getamount() {
		return this.amount;
	}
	
	public void setAmount (double  amount) {
		this.amount = amount;
	}
		
	public void setCustomer (Customer customer) {
		this.customer = customer;
	}
	
	public Customer getcustomer () {
		return this.customer;
	}
	

	public int getcustomerID() {
		return this.getcustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getcustomer().getname();
	
	}
	
	public int getcustomerDiscount() {
		return this.getcustomer().getdiscount();
	}
	
	public double getAmountAfterDiscount () {
		return this.getamount() - (this.getamount() * this.getcustomerDiscount()/100);
	}
	
	public String tostring() {
		
		return "INvoice{ID= " + this.getInvoiceID()+
		" ,customer=" + customer.toString()+
		",amount=" + this.getAmountAfterDiscount()	+ "]";
	
	}
	
}
